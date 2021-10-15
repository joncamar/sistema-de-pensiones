INSERT INTO user(id, firstname, lastname, birthdate) VALUES ('86ca2812-b98a-4362-ab45-c185955c2c3c', 'Ana', 'Smith', {ts '1993-09-17 18:47:52.69'});
INSERT INTO user(id, firstname, lastname, birthdate) VALUES ('fdabf27a-ee84-4bfb-9d6c-832da2988ce0', 'John', 'Doe', {ts '2000-12-29 15:10:52.69'});
INSERT INTO user(id, firstname, lastname, birthdate) VALUES ('539e301e-0d23-42df-9f9c-dcfec50df2d5', 'rayar', 'Midnight', {ts '2010-01-30 01:15:52.69'});

INSERT INTO registry(id, registry_location, registration_date, is_active) VALUES (1, 'Bogota', {ts '2012-09-17 18:47:52.69'}, 0);
INSERT INTO registry(id, registry_location, registration_date, is_active) VALUES (2, 'Medellin', {ts '2012-09-17 18:47:52.69'}, 1);
INSERT INTO registry(id, registry_location, registration_date, is_active) VALUES (3, 'Barranquilla', {ts '2012-09-17 18:47:52.69'}, 0);
INSERT INTO registry(id, registry_location, registration_date, is_active) VALUES (4, 'Tunja', {ts '2012-09-17 18:47:52.69'}, 1);
INSERT INTO registry(id, registry_location, registration_date, is_active) VALUES (5, 'Bogota', {ts '2012-09-17 18:47:52.69'}, 1);
INSERT INTO registry(id, registry_location, registration_date, is_active) VALUES (6, 'Medellin', {ts '2012-09-17 18:47:52.69'}, 0);
INSERT INTO registry(id, registry_location, registration_date, is_active) VALUES (7, 'Cali', {ts '2012-09-17 18:47:52.69'}, 1);
INSERT INTO registry(id, registry_location, registration_date, is_active) VALUES (8, 'Cali', {ts '2012-09-17 18:47:52.69'}, 0);

INSERT INTO user_registry (user_id, registry_id) VALUES ('86ca2812-b98a-4362-ab45-c185955c2c3c', 1);
INSERT INTO user_registry (user_id, registry_id) VALUES ('86ca2812-b98a-4362-ab45-c185955c2c3c', 2);
INSERT INTO user_registry (user_id, registry_id) VALUES ('86ca2812-b98a-4362-ab45-c185955c2c3c', 3);
INSERT INTO user_registry (user_id, registry_id) VALUES ('fdabf27a-ee84-4bfb-9d6c-832da2988ce0', 4);
INSERT INTO user_registry (user_id, registry_id) VALUES ('539e301e-0d23-42df-9f9c-dcfec50df2d5', 5);
INSERT INTO user_registry (user_id, registry_id) VALUES ('539e301e-0d23-42df-9f9c-dcfec50df2d5', 6);
INSERT INTO user_registry (user_id, registry_id) VALUES ('539e301e-0d23-42df-9f9c-dcfec50df2d5', 7);
INSERT INTO user_registry (user_id, registry_id) VALUES ('539e301e-0d23-42df-9f9c-dcfec50df2d5', 8);
