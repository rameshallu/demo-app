--vehicle
insert into vehicle.car(id, registration_number) values(1, 'AP05CC1000');
insert into vehicle.bike(id, registration_number) values(1, 'AP05CC2000');

insert into vehicle.make(id, name) values(1, 'Hyunadai');
insert into vehicle.make(id, name) values(2, 'Maruti Suzuki');

insert into vehicle.model(id, name, make_id) values(1, 'Alcazar', 1);
insert into vehicle.model(id, name,  make_id) values(2, 'Alto', 2);

--2.0 l MPi Petrol 6-Speed Manual Signature 6 Seater Dual Tone
--1.5 l CRDi Diesel 6-Speed Automatic Signature (O) 6 seater Dual Tone
insert into vehicle.variant(id, name,  model_id) values(1, '2.0 l MPi', 1);
insert into vehicle.variant(id, name,  model_id) values(2, '1.5 l CRDi', 1);
insert into vehicle.variant(id, name,  model_id) values(11, '800', 2);
insert into vehicle.variant(id, name,  model_id) values(12, 'K10', 2);

insert into vehicle.trim(id, name,  model_id) values(1, 'Signature', 1);
insert into vehicle.trim(id, name,  model_id) values(2, 'Platinum', 1);
insert into vehicle.trim(id, name,  model_id) values(3, 'Prestige ', 1);
--insert into vehicle.trim(id, name,  model_id) values(11, 'Standard', 2);

insert into vehicle.version(id, model_id, year) values(1, 1, 2022);

insert into vehicle.fuel_type(id, name) values(1, 'Petrol');

insert into vehicle.transmission_type(id, name) values(1, 'Manual');
insert into vehicle.transmission(id, speed, transmission_type_id) values(1, 6, 1);

insert into vehicle.paint_type(id, name) values(1, 'Dual Tone');

--Hyundai Alcazar 2022 2.0 l MPi Petrol 6-Speed Manual Signature 6 Seater Dual Tone
insert into vehicle.configuration(id, make_id, model_id, version_id, variant_id, fuel_type_id, transmission_id, trim_id, seater, paint_type_id) values(1, 1, 1, 1, 1, 1, 1, 1, 6, 1);

insert into vehicle.price_region(id, name) values(1, 'Bhimavaram');
--
insert into vehicle.price(id, configuration_id, price_region_id, amount) values(1, 1, 1, 1899000.00);

--commerce
insert into commerce.category(id, name) values(1, 'Fruits & Vegetables');
insert into commerce.category(id, name) values(2, 'Beauty & Hygiene');
insert into commerce.category(id, name) values(3, 'Edible oils & Ghee');

insert into commerce.product(id, name, price, category_id) values(1, 'Apple', 30.00, 1);
insert into commerce.product(id, name, price, category_id) values(2, 'Orange', 30.00, 1);
insert into commerce.product(id, name, price, category_id) values(3, 'Banana', 5.00, 1);

insert into commerce.product(id, name, price, category_id) values(11, 'Santoor body soap', 10.00, 2);
insert into commerce.product(id, name, price, category_id) values(21, 'Freedom Sunflower oil 1kg', 170.00, 3);
