--vehicle
insert into vehicle.car(id, registration_number) values(1, 'AP05CC1000');
insert into vehicle.bike(id, registration_number) values(1, 'AP05CC2000');

insert into vehicle.make(id, name) values(1, 'Hyunadai');
insert into vehicle.make(id, name) values(2, 'Maruti Suzuki');

insert into vehicle.model(id, name, make_id) values(1, 'Alcazar', 1);
insert into vehicle.model(id, name,  make_id) values(2, 'Alto', 2);

insert into vehicle.variant(id, name,  model_id) values(1, '800', 2);
insert into vehicle.variant(id, name,  model_id) values(2, 'K10', 2);

--commerce
insert into commerce.category(id, name) values(1, 'Fruits & Vegetables');
insert into commerce.category(id, name) values(2, 'Beauty & Hygiene');
insert into commerce.category(id, name) values(3, 'Edible oils & Ghee');

insert into commerce.product(id, name, price, category_id) values(1, 'Apple', 30.00, 1);
insert into commerce.product(id, name, price, category_id) values(2, 'Orange', 30.00, 1);
insert into commerce.product(id, name, price, category_id) values(3, 'Banana', 5.00, 1);

insert into commerce.product(id, name, price, category_id) values(11, 'Santoor body soap', 10.00, 2);
insert into commerce.product(id, name, price, category_id) values(21, 'Freedom Sunflower oil 1kg', 170.00, 3);
