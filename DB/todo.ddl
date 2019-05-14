CREATE TABLE todo(
    todo_id VARCHAR(255) PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    content TEXt NOT NULL,
    priority INT NOT NULL UNIQUE,
    startdate DATETIME NOT NULL DEFAULT(now()),
    enddate DATETIME NOT NULL DEFAULT(now()),
    status_id VARCHAR(255) NOT NULL
) ENGINE = InnoDB DEFAULT CHARSET=utf8; 

ALTER TABLE todo ADD FOREIGN KEY (status_id) REFERENCES status(status_id) ON DELETE CASCADE;
