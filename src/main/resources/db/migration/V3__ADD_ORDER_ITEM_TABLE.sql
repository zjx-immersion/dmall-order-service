CREATE TABLE `jx_order_item` (
  `id`                 BIGINT       NOT NULL AUTO_INCREMENT PRIMARY KEY,
  `ORDER_ID` BIGINT,
  `amount` BIGINT,
  `sku_snapshot_id` BIGINT,
  `created_date` TIMESTAMP DEFAULT NOW()
);