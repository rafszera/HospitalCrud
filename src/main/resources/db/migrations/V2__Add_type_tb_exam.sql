-- V2: Migration to add COLUMN TYPE to Exams


ALTER TABLE tb_exams
ADD COLUMN type VARCHAR(255);
