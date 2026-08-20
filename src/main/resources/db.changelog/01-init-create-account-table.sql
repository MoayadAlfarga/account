--liquibase formatted sql

--changeset moayad:1
CREATE TABLE IF NOT EXISTS `account_status` (
    `id` BIGINT AUTO_INCREMENT PRIMARY KEY,
    `account_status` VARCHAR(50) NOT NULL,
    `account_id` BIGINT,
    `created_at` DATETIME DEFAULT NULL,
    `created_by` VARCHAR(100) DEFAULT NULL,
    `updated_at` DATETIME DEFAULT NULL,
    `updated_by` VARCHAR(100) DEFAULT NULL
);

CREATE TABLE IF NOT EXISTS `accounts` (
    `id` BIGINT AUTO_INCREMENT PRIMARY KEY,
    `account_type` VARCHAR(50) DEFAULT NULL,
    `first_name` VARCHAR(100) DEFAULT NULL,
    `second_name` VARCHAR(100) DEFAULT NULL,
    `third_name` VARCHAR(100) DEFAULT NULL,
    `email` VARCHAR(100) DEFAULT NULL,
    `phone_number` VARCHAR(20) DEFAULT NULL,
    `address` VARCHAR(255) DEFAULT NULL,
    `age` INT DEFAULT NULL,
    `gender` VARCHAR(10) DEFAULT NULL,
    `nationality` VARCHAR(50) DEFAULT NULL,
    `national_id` VARCHAR(50) DEFAULT NULL,
    `account_number` BIGINT DEFAULT NULL,
    `birth_date` DATE DEFAULT NULL,
    `status_id` BIGINT,
    `created_at` DATETIME DEFAULT NULL,
    `created_by` VARCHAR(100) DEFAULT NULL,
    `updated_at` DATETIME DEFAULT NULL,
    `updated_by` VARCHAR(100) DEFAULT NULL,
    CONSTRAINT `fk_status` FOREIGN KEY (`status_id`) REFERENCES `account_status` (`id`)
);

ALTER TABLE `account_status` ADD CONSTRAINT `fk_account` FOREIGN KEY (`account_id`) REFERENCES `accounts` (`id`);
