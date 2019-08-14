DELETE FROM user_roles;
DELETE FROM users;
DELETE FROM dishes;
DELETE FROM restaurants;
ALTER SEQUENCE global_seq RESTART WITH 100000;

INSERT INTO users (name, email, password) VALUES
    ('User', 'user@gmail.com', 'user123');

INSERT INTO user_roles (role, user_id) VALUES
    ('ROLE_USER', 100000);

INSERT INTO restaurants (name) VALUES
    ('Perchini'),
    ('USSR'),
    ('KFC');

INSERT INTO dishes (name, price, restaurant_id) VALUES
    ('soup', 100, 100001),
    ('beef', 200, 100001),
    ('Cheburek', 80, 100002),
    ('Borsch', 150, 100002),
    ('Vedro', 500, 100003),
    ('Burger', 200, 100003);