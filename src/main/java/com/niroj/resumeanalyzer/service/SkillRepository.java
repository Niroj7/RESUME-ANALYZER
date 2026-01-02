package com.niroj.resumeanalyzer.service;

import java.util.HashSet;
import java.util.Set;

public class SkillRepository {

    public static Set<String> getAllSkills() {

        Set<String> skills = new HashSet<>();

        // ================= CORE PROGRAMMING LANGUAGES =================
        skills.addAll(Set.of(
            "python",
            "java",
            "scala",
            "c++",
            "c",
            "c#",
            "go",
            "golang",
            "rust",
            "php",
            "javascript",
            "typescript",
            "node.js",
            "bash",
            "shell scripting",
            "powershell",
            "r",
            "matlab",
            "kotlin",
            "swift"
        ));

        // ================= DATA ENGINEERING =================
        skills.addAll(Set.of(
            "data engineering",
            "etl",
            "elt",
            "data pipelines",
            "data ingestion",
            "data lake",
            "azure data lake",
            "bronze-silver-gold architecture",
            "data warehouse",
            "data models",
            "dimensional modeling",
            "star schema",
            "kimball",
            "schema enforcement",
            "schema evolution",
            "data quality",
            "data validation",
            "metadata management",
            "data catalog",
            "data governance",
            "real-time streaming"
        ));

        // ================= BIG DATA & STREAMING =================
        skills.addAll(Set.of(
            "apache spark",
            "pyspark",
            "spark structured streaming",
            "apache kafka",
            "kafka",
            "apache airflow",
            "databricks",
            "hadoop",
            "hdfs",
            "mapreduce",
            "delta lake",
            "parquet",
            "csv",
            "avro"
        ));

        // ================= CLOUD (AWS / AZURE / GCP) =================
        skills.addAll(Set.of(
            "aws",
            "aws s3",
            "aws glue",
            "aws lambda",
            "aws step functions",
            "aws redshift",
            "iam",
            "s3 bucket policies",
            "cloudformation",

            "azure",
            "azure data factory",
            "azure devops",
            "azure synapse",
            "rbac",

            "gcp",
            "bigquery",
            "dataflow",
            "dataproc"
        ));

        // ================= DATABASES =================
        skills.addAll(Set.of(
            "sql",
            "sql server",
            "mysql",
            "postgresql",
            "mongodb",
            "snowflake",
            "dynamodb",
            "redis",
            "cassandra",
            "oracle"
        ));

        // ================= DEVOPS & INFRA =================
        skills.addAll(Set.of(
            "docker",
            "kubernetes",
            "terraform",
            "ci/cd",
            "jenkins",
            "github actions",
            "gitlab ci",
            "monitoring",
            "logging"
        ));

        // ================= DATA ANALYST =================
        skills.addAll(Set.of(
            "data analysis",
            "power bi",
            "tableau",
            "looker",
            "excel",
            "google sheets",
            "matplotlib",
            "seaborn",
            "statistical analysis",
            "dashboarding",
            "reporting"
        ));

        // ================= ACCOUNTING =================
        skills.addAll(Set.of(
            "financial accounting",
            "managerial accounting",
            "cost accounting",
            "general ledger",
            "accounts payable",
            "accounts receivable",
            "balance sheet",
            "income statement",
            "cash flow statement",
            "gaap",
            "ifrs",
            "auditing",
            "taxation",
            "budgeting",
            "forecasting"
        ));

        // ================= FINANCE =================
        skills.addAll(Set.of(
            "corporate finance",
            "financial modeling",
            "valuation",
            "risk management",
            "investment analysis",
            "portfolio management",
            "capital markets",
            "derivatives",
            "fixed income",
            "equity research",
            "financial planning"
        ));

        // ================= IT SUPPORT & NETWORKING =================
        skills.addAll(Set.of(
            "it support",
            "troubleshooting",
            "networking",
            "tcp/ip",
            "dns",
            "dhcp",
            "vpn",
            "firewalls",
            "active directory",
            "windows administration",
            "linux administration",
            "hardware support",
            "ticketing systems",
            "help desk",
            "system administration",
            "endpoint management"
        ));

        // ================= SOFTWARE DEVELOPMENT (SDE) =================
        skills.addAll(Set.of(
            "object-oriented programming",
            "system design",
            "data structures",
            "algorithms",
            "design patterns",
            "microservices",
            "rest",
            "api",
            "unit testing",
            "integration testing",
            "code review",
            "scalability",
            "performance optimization"
        ));

        // ================= FRONTEND =================
        skills.addAll(Set.of(
            "html",
            "css",
            "react",
            "angular",
            "vue",
            "redux",
            "next.js",
            "responsive design",
            "ui/ux",
            "web accessibility",
            "frontend testing",
            "webpack",
            "vite"
        ));

        // ================= RESEARCH =================
        skills.addAll(Set.of(
            "research methods",
            "literature review",
            "data collection",
            "data analysis",
            "experimental design",
            "qualitative research",
            "quantitative research",
            "academic writing",
            "statistical modeling",
            "hypothesis testing"
        ));

        // ================= SOCIOLOGY =================
        skills.addAll(Set.of(
            "social research",
            "survey design",
            "demographic analysis",
            "policy analysis",
            "social theory",
            "qualitative analysis",
            "quantitative analysis",
            "community studies",
            "social statistics",
            "ethnography"
        ));

        // ================= BUSINESS =================
        skills.addAll(Set.of(
            "business analysis",
            "strategy",
            "operations management",
            "project management",
            "stakeholder management",
            "process improvement",
            "market research",
            "business intelligence",
            "requirements gathering",
            "agile"
        ));

        // ================= CIVIL ENGINEERING =================
        skills.addAll(Set.of(
            "civil engineering",
            "structural analysis",
            "autocad",
            "construction management",
            "surveying",
            "geotechnical engineering",
            "transportation engineering",
            "hydraulics",
            "project estimation",
            "site engineering"
        ));

        // ================= MECHANICAL ENGINEERING =================
        skills.addAll(Set.of(
            "mechanical engineering",
            "thermodynamics",
            "fluid mechanics",
            "solid mechanics",
            "cad",
            "cam",
            "manufacturing processes",
            "materials science",
            "heat transfer",
            "machine design"
        ));

        // ================= ELECTRICAL ENGINEERING =================
        skills.addAll(Set.of(
            "electrical engineering",
            "circuit analysis",
            "power systems",
            "control systems",
            "signal processing",
            "embedded systems",
            "plc",
            "microcontrollers",
            "electronics",
            "instrumentation"
        ));

        // ================= AI / ML / LLM =================
        skills.addAll(Set.of(
            "machine learning",
            "deep learning",
            "nlp",
            "llm",
            "groq api",
            "llama",
            "openai api",
            "model deployment",
            "feature engineering",
            "model evaluation"
        ));

        return skills;
    }
}
