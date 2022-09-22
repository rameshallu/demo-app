insert into car(id, registration_number) values(1, 'AP05CC1000');


insert into bike(id, registration_number) values(1, 'AP05CC2000');

insert into commerce.category(id, name) values(1, 'Fruits & Vegetables');
insert into commerce.category(id, name) values(2, 'Beauty & Hygiene');
insert into commerce.category(id, name) values(3, 'Edible oils & Ghee');


insert into commerce.product(id, name, price, category_id) values(1, 'Apple', 30.00, 1);
insert into commerce.product(id, name, price, category_id) values(2, 'Orange', 30.00, 1);
insert into commerce.product(id, name, price, category_id) values(3, 'Banana', 5.00, 1);

insert into commerce.product(id, name, price, category_id) values(11, 'Santoor body soap', 10.00, 2);

insert into commerce.product(id, name, price, category_id) values(21, 'Freedom Sunflower oil 1kg', 170.00, 3);


--insert into product(id, name, price) values(2, 'Orange', "15.00");
--insert into product(id, name, price) values(1, "Banana", "5.00");