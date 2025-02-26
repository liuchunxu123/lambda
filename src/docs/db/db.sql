ALTER TABLE `t_transaction_ada`
MODIFY COLUMN `delivery_no`  varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT 'お荷物伝票番号' AFTER `res_sps_transaction_id`,
MODIFY COLUMN `delivery_cofirm_date`  varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '発送日' AFTER `delivery_method`,
ADD COLUMN `delivery_and_pay_id`  varchar(32) NULL COMMENT '送付先ID' AFTER `delivery_cofirm_date`,
ADD COLUMN `delivery_details_id`  varchar(32) NULL COMMENT '発送明細ID' AFTER `delivery_and_pay_id`;

ALTER TABLE `m_select_option_grp`
ADD COLUMN `sale_start_date`  varchar(32) NULL COMMENT '販売開始日' AFTER `product_code`,
ADD COLUMN `sale_end_date`  varchar(32) NULL COMMENT '販売終了日' AFTER `sale_start_date`;




