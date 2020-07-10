## Part 1: Test it with SQL

SHOW COLUMNS FROM job

id(int)
name(varchar(255))
employer_id(int)

## Part 2: Test it with SQL

SELECT name FROM techjobs.employer WHERE location = "St. Louis City";

## Part 3: Test it with SQL

DROP TABLE job

## Part 4: Test it with SQL

SELECT skill.name, skill.description FROM job_skills INNER JOIN skill WHERE job_skills.skills_id = skill.id ORDER BY name;