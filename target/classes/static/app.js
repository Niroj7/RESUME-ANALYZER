async function analyzeMatch() {

    const loader = document.getElementById("loader");
    const result = document.getElementById("result");
    const scoreText = document.getElementById("scoreText");
    const matchedEl = document.getElementById("matched");
    const missingEl = document.getElementById("missing");
    const aiBox = document.getElementById("aiSuggestions");
    const suggestionList = document.getElementById("suggestionList");

    loader.classList.remove("hidden");
    result.classList.add("hidden");

    const formData = new FormData();
    formData.append("resumeFile", document.getElementById("resumeFile").files[0]);
    formData.append("jdFile", document.getElementById("jdFile").files[0]);
    formData.append("resumeText", document.getElementById("resumeText").value);
    formData.append("jdText", document.getElementById("jdText").value);

    try {
        const res = await fetch("/api/analyze", {
            method: "POST",
            body: formData
        });

        const data = await res.json();
        console.log("API RESPONSE:", data);

        loader.classList.add("hidden");
        result.classList.remove("hidden");

        // ✅ SCORE
        scoreText.innerText = Math.round(data.score) + "%";

        // ✅ SKILLS
        matchedEl.innerHTML = "";
        missingEl.innerHTML = "";

        data.matchedSkills.forEach(skill => {
            const li = document.createElement("li");
            li.textContent = skill;
            matchedEl.appendChild(li);
        });

        data.missingSkills.forEach(skill => {
            const li = document.createElement("li");
            li.textContent = skill;
            missingEl.appendChild(li);
        });

        // ✅ AI SUGGESTIONS
        suggestionList.innerHTML = "";
        aiBox.classList.remove("hidden");

        if (data.suggestions && data.suggestions.length > 0) {
            data.suggestions.forEach(s => {
                const li = document.createElement("li");
                li.textContent = s;
                suggestionList.appendChild(li);
            });
        }

    } catch (err) {
        loader.classList.add("hidden");
        alert("Backend error — check server logs");
        console.error(err);
    }
}
