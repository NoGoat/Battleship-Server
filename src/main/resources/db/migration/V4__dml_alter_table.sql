ALTER TABLE user
ADD CONSTRAINT unique_username
UNIQUE (username);

ALTER TABLE user
ADD CONSTRAINT unique_email
UNIQUE (email);

