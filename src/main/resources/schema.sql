CREATE TABLE IF NOT EXISTS todos (
    id BIGSERIAL PRIMARY KEY,
    title VARCHAR(100) NOT NULL,
    deadline TIMESTAMP,
    assignee_name VARCHAR(30)
);