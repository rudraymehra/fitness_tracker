CREATE TABLE users (
                       id SERIAL PRIMARY KEY,
                       username VARCHAR(50) NOT NULL,
                       password VARCHAR(100) NOT NULL
);

CREATE TABLE workouts (
                          id SERIAL PRIMARY KEY,
                          user_id INT NOT NULL,
                          type VARCHAR(50),
                          duration INT, -- in minutes
                          date DATE,
                          FOREIGN KEY (user_id) REFERENCES users(id)
);

CREATE TABLE food_logs (
                           id SERIAL PRIMARY KEY,
                           user_id INT NOT NULL,
                           food_item VARCHAR(100),
                           calories INT,
                           date DATE,
                           FOREIGN KEY (user_id) REFERENCES users(id)
);
