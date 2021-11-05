


-- ----------------------------
-- Table structure for EVENT_EXECUTION
-- ----------------------------

CREATE TABLE EVENT_EXECUTION (
  "CREATED_ON" DATE,
  "MODIFIED_ON" DATE,
  "EVENT_HANDLER_NAME" NVARCHAR2(255) NOT NULL,
  "EVENT_NAME" NVARCHAR2(255) NOT NULL,
  "MESSAGE_ID" NVARCHAR2(255) NOT NULL,
  "EXECUTION_ID" NVARCHAR2(255) NOT NULL,
  "JSON_DATA" NCLOB NOT NULL
)
LOGGING
NOCOMPRESS
PCTFREE 10
INITRANS 1
STORAGE (
  INITIAL 65536 
  NEXT 1048576 
  MINEXTENTS 1
  MAXEXTENTS 2147483645
  FREELISTS 1
  FREELIST GROUPS 1
  BUFFER_POOL DEFAULT
)
PARALLEL 1
NOCACHE
DISABLE ROW MOVEMENT
;

-- ----------------------------
-- Records of EVENT_EXECUTION
-- ----------------------------

-- ----------------------------
-- Table structure for META_EVENT_HANDLE
-- ----------------------------

CREATE TABLE META_EVENT_HANDLER (
  ID NUMBER(11,0) NOT NULL,
  CREATED_ON DATE,
  MODIFIED_ON DATE,
  NAME NVARCHAR2(255) NOT NULL,
  EVENT NVARCHAR2(255) NOT NULL,
  ACTIVE NUMBER(4,0) NOT NULL,
  JSON_DATA NCLOB NOT NULL
)
LOGGING
NOCOMPRESS
PCTFREE 10
INITRANS 1
STORAGE (
  INITIAL 65536 
  NEXT 1048576 
  MINEXTENTS 1
  MAXEXTENTS 2147483645
  FREELISTS 1
  FREELIST GROUPS 1
  BUFFER_POOL DEFAULT
)
PARALLEL 1
NOCACHE
DISABLE ROW MOVEMENT
;

-- ----------------------------
-- Records of META_EVENT_HANDLE
-- ----------------------------

-- ----------------------------
-- Table structure for META_TASK_DEF
-- ----------------------------

CREATE TABLE META_TASK_DEF (
  CREATED_ON DATE,
  MODIFIED_ON DATE,
  NAME NVARCHAR2(255) NOT NULL,
  JSON_DATA NCLOB NOT NULL
)
LOGGING
NOCOMPRESS
PCTFREE 10
INITRANS 1
STORAGE (
  INITIAL 65536 
  NEXT 1048576 
  MINEXTENTS 1
  MAXEXTENTS 2147483645
  FREELISTS 1
  FREELIST GROUPS 1
  BUFFER_POOL DEFAULT
)
PARALLEL 1
NOCACHE
DISABLE ROW MOVEMENT
;

-- ----------------------------
-- Records of META_TASK_DEF
-- ----------------------------

-- ----------------------------
-- Table structure for META_WORKFLOW_DEF
-- ----------------------------
CREATE TABLE META_WORKFLOW_DEF(
  CREATED_ON DATE,
  MODIFIED_ON DATE,
  NAME NVARCHAR2(255) NOT NULL,
  VERSION NUMBER(11,0) NOT NULL,
  LATEST_VERSION NUMBER(11,0) NOT NULL,
  JSON_DATA NCLOB NOT NULL
)
LOGGING
NOCOMPRESS
PCTFREE 10
INITRANS 1
STORAGE (
  INITIAL 65536 
  NEXT 1048576 
  MINEXTENTS 1
  MAXEXTENTS 2147483645
  FREELISTS 1
  FREELIST GROUPS 1
  BUFFER_POOL DEFAULT
)
PARALLEL 1
NOCACHE
DISABLE ROW MOVEMENT
;

-- ----------------------------
-- Records of META_WORKFLOW_DEF
-- ----------------------------

-- ----------------------------
-- Table structure for POLL_DATA
-- ----------------------------
CREATE TABLE POLL_DATA (
  CREATED_ON DATE,
  MODIFIED_ON DATE,
  QUEUE_NAME NVARCHAR2(255) NOT NULL,
  DOMAIN NVARCHAR2(255) NOT NULL,
  JSON_DATA NCLOB NOT NULL
)
LOGGING
NOCOMPRESS
PCTFREE 10
INITRANS 1
STORAGE (
  INITIAL 65536 
  NEXT 1048576 
  MINEXTENTS 1
  MAXEXTENTS 2147483645
  FREELISTS 1
  FREELIST GROUPS 1
  BUFFER_POOL DEFAULT
)
PARALLEL 1
NOCACHE
DISABLE ROW MOVEMENT
;

-- ----------------------------
-- Records of POLL_DATA
-- ----------------------------

-- ----------------------------
-- Table structure for QUEUE
-- ----------------------------

CREATE TABLE QUEUE (
  CREATED_ON DATE,
  QUEUE_NAME NVARCHAR2(255) NOT NULL
)
LOGGING
NOCOMPRESS
PCTFREE 10
INITRANS 1
STORAGE (
  INITIAL 65536 
  NEXT 1048576 
  MINEXTENTS 1
  MAXEXTENTS 2147483645
  FREELISTS 1
  FREELIST GROUPS 1
  BUFFER_POOL DEFAULT
)
PARALLEL 1
NOCACHE
DISABLE ROW MOVEMENT
;

-- ----------------------------
-- Records of QUEUE
-- ----------------------------

-- ----------------------------
-- Table structure for QUEUE_MESSAGE
-- ----------------------------

CREATE TABLE QUEUE_MESSAGE (
  CREATED_ON DATE NOT NULL,
  DELIVER_ON DATE,
  QUEUE_NAME NVARCHAR2(255) NOT NULL,
  MESSAGE_ID NVARCHAR2(255) NOT NULL,
  PRIORITY NUMBER(4,0),
  POPPED NUMBER(4,0),
  OFFSET_TIME_SECONDS NCLOB,
  PAYLOAD NCLOB
)
LOGGING
NOCOMPRESS
PCTFREE 10
INITRANS 1
STORAGE (
  INITIAL 65536 
  NEXT 1048576 
  MINEXTENTS 1
  MAXEXTENTS 2147483645
  FREELISTS 1
  FREELIST GROUPS 1
  BUFFER_POOL DEFAULT
)
PARALLEL 1
NOCACHE
DISABLE ROW MOVEMENT
;

-- ----------------------------
-- Records of QUEUE_MESSAGE
-- ----------------------------

-- ----------------------------
-- Table structure for TASK
-- ----------------------------

CREATE TABLE TASK (
  CREATED_ON DATE,
  MODIFIED_ON DATE,
  TASK_ID NVARCHAR2(255) NOT NULL,
  JSON_DATA NCLOB NOT NULL
)
LOGGING
NOCOMPRESS
PCTFREE 10
INITRANS 1
STORAGE (
  INITIAL 65536 
  NEXT 1048576 
  MINEXTENTS 1
  MAXEXTENTS 2147483645
  FREELISTS 1
  FREELIST GROUPS 1
  BUFFER_POOL DEFAULT
)
PARALLEL 1
NOCACHE
DISABLE ROW MOVEMENT
;

-- ----------------------------
-- Records of TASK
-- ----------------------------

-- ----------------------------
-- Table structure for TASK_IN_PROGRESS
-- ----------------------------

CREATE TABLE TASK_IN_PROGRESS (
  CREATED_ON DATE,
  MODIFIED_ON DATE,
  TASK_DEF_NAME NVARCHAR2(255) NOT NULL,
  TASK_ID NVARCHAR2(255) NOT NULL,
  WORKFLOW_ID NVARCHAR2(255) NOT NULL,
  IN_PROGRESS_STATUS NUMBER(4,0) NOT NULL
)
LOGGING
NOCOMPRESS
PCTFREE 10
INITRANS 1
STORAGE (
  INITIAL 65536 
  NEXT 1048576 
  MINEXTENTS 1
  MAXEXTENTS 2147483645
  FREELISTS 1
  FREELIST GROUPS 1
  BUFFER_POOL DEFAULT
)
PARALLEL 1
NOCACHE
DISABLE ROW MOVEMENT
;

-- ----------------------------
-- Records of TASK_IN_PROGRESS
-- ----------------------------

-- ----------------------------
-- Table structure for TASK_SCHEDULED
-- ----------------------------

CREATE TABLE TASK_SCHEDULED (
  CREATED_ON DATE,
  MODIFIED_ON DATE,
  WORKFLOW_ID NVARCHAR2(255) NOT NULL,
  TASK_KEY NVARCHAR2(255) NOT NULL,
  TASK_ID NVARCHAR2(255) NOT NULL
)
LOGGING
NOCOMPRESS
PCTFREE 10
INITRANS 1
STORAGE (
  INITIAL 65536 
  NEXT 1048576 
  MINEXTENTS 1
  MAXEXTENTS 2147483645
  FREELISTS 1
  FREELIST GROUPS 1
  BUFFER_POOL DEFAULT
)
PARALLEL 1
NOCACHE
DISABLE ROW MOVEMENT
;

-- ----------------------------
-- Records of TASK_SCHEDULED
-- ----------------------------

-- ----------------------------
-- Table structure for WORKFLOW
-- ----------------------------

CREATE TABLE WORKFLOW (
  CREATED_ON DATE,
  MODIFIED_ON DATE,
  WORKFLOW_ID NVARCHAR2(255) NOT NULL,
  CORRELATION_ID NVARCHAR2(255),
  JSON_DATA NCLOB NOT NULL
)
LOGGING
NOCOMPRESS
PCTFREE 10
INITRANS 1
STORAGE (
  INITIAL 65536 
  NEXT 1048576 
  MINEXTENTS 1
  MAXEXTENTS 2147483645
  FREELISTS 1
  FREELIST GROUPS 1
  BUFFER_POOL DEFAULT
)
PARALLEL 1
NOCACHE
DISABLE ROW MOVEMENT
;

-- ----------------------------
-- Records of WORKFLOW
-- ----------------------------

-- ----------------------------
-- Table structure for WORKFLOW_DEF_TO_WORKFLOW
-- ----------------------------
CREATE TABLE WORKFLOW_DEF_TO_WORKFLOW (
  CREATED_ON DATE,
  MODIFIED_ON DATE,
  WORKFLOW_DEF NVARCHAR2(255) NOT NULL,
  DATA_STR NUMBER(11,0) NOT NULL,
  WORKFLOW_ID NVARCHAR2(255) NOT NULL
)
LOGGING
NOCOMPRESS
PCTFREE 10
INITRANS 1
STORAGE (
  INITIAL 65536 
  NEXT 1048576 
  MINEXTENTS 1
  MAXEXTENTS 2147483645
  FREELISTS 1
  FREELIST GROUPS 1
  BUFFER_POOL DEFAULT
)
PARALLEL 1
NOCACHE
DISABLE ROW MOVEMENT
;

-- ----------------------------
-- Records of WORKFLOW_DEF_TO_WORKFLOW
-- ----------------------------

-- ----------------------------
-- Table structure for WORKFLOW_PENDING
-- ----------------------------

CREATE TABLE WORKFLOW_PENDING (
  CREATED_ON DATE,
  MODIFIED_ON DATE,
  WORKFLOW_TYPE NVARCHAR2(255) NOT NULL,
  WORKFLOW_ID NVARCHAR2(255) NOT NULL
)
LOGGING
NOCOMPRESS
PCTFREE 10
INITRANS 1
STORAGE (
  INITIAL 65536 
  NEXT 1048576 
  MINEXTENTS 1
  MAXEXTENTS 2147483645
  FREELISTS 1
  FREELIST GROUPS 1
  BUFFER_POOL DEFAULT
)
PARALLEL 1
NOCACHE
DISABLE ROW MOVEMENT
;

-- ----------------------------
-- Records of WORKFLOW_PENDING
-- ----------------------------

-- ----------------------------
-- Table structure for WORKFLOW_TO_TASK
-- ----------------------------
CREATE TABLE WORKFLOW_TO_TASK (
  CREATED_ON DATE,
  MODIFIED_ON DATE,
  WORKFLOW_ID NVARCHAR2(255) NOT NULL,
  TASK_ID NVARCHAR2(255) NOT NULL
)
LOGGING
NOCOMPRESS
PCTFREE 10
INITRANS 1
STORAGE (
  INITIAL 65536 
  NEXT 1048576 
  MINEXTENTS 1
  MAXEXTENTS 2147483645
  FREELISTS 1
  FREELIST GROUPS 1
  BUFFER_POOL DEFAULT
)
PARALLEL 1
NOCACHE
DISABLE ROW MOVEMENT
;

-- ----------------------------
-- Records of WORKFLOW_TO_TASK
-- ----------------------------

-- ----------------------------
-- View structure for AQ$DEF$_AQCALL
-- ----------------------------
CREATE OR REPLACE VIEW "SYSTEM"."AQ$DEF$_AQCALL" AS SELECT q_name QUEUE, msgid MSG_ID, corrid CORR_ID, priority MSG_PRIORITY, decode(state, 0,   'READY',
                                1,   'WAIT',
                                2,   'PROCESSED',
                                3,   'EXPIRED',
                                10,  'BUFFERED_EXPIRED') MSG_STATE, cast(FROM_TZ(delay, '00:00')
                  at time zone sessiontimezone as date) DELAY, cast(FROM_TZ(delay, '00:00')
               at time zone sessiontimezone as timestamp) DELAY_TIMESTAMP, expiration, cast(FROM_TZ(enq_time, '00:00')
                  at time zone sessiontimezone as date) ENQ_TIME, cast(FROM_TZ(enq_time, '00:00')
                  at time zone sessiontimezone as timestamp) 
                  ENQ_TIMESTAMP, enq_uid ENQ_USER_ID, enq_tid ENQ_TXN_ID, cast(FROM_TZ(deq_time, '00:00')
                  at time zone sessiontimezone as date) DEQ_TIME, cast(FROM_TZ(deq_time, '00:00')
                  at time zone sessiontimezone as timestamp) 
                  DEQ_TIMESTAMP, deq_uid DEQ_USER_ID, deq_tid DEQ_TXN_ID, retry_count,  decode (state, 0, exception_qschema, 
                                  1, exception_qschema, 
                                  2, exception_qschema,  
                                  NULL) EXCEPTION_QUEUE_OWNER,  decode (state, 0, exception_queue, 
                                  1, exception_queue, 
                                  2, exception_queue,  
                                  NULL) EXCEPTION_QUEUE,  user_data,  decode (state, 3, 
                     decode (deq_tid, 'INVALID_TRANSACTION', NULL, 
                             exception_queue), NULL)
                                ORIGINAL_QUEUE_NAME,  decode (state, 3, 
                     decode (deq_tid, 'INVALID_TRANSACTION', NULL, 
                             exception_qschema), NULL)
                                ORIGINAL_QUEUE_OWNER,  decode(state, 3, 
                     decode(deq_time, NULL, 
                       decode(deq_tid, NULL,
                       decode (expiration , NULL , 'MAX_RETRY_EXCEEDED',
                            'TIME_EXPIRATION'),
                              'INVALID_TRANSACTION', NULL,
                              'MAX_RETRY_EXCEEDED'), NULL), NULL) 
                             EXPIRATION_REASON  FROM "DEF$_AQCALL" WHERE state != 7 AND   state != 9 WITH READ ONLY CONSTRAINTS "SYS_C003489";

-- ----------------------------
-- View structure for AQ$DEF$_AQERROR
-- ----------------------------
CREATE OR REPLACE VIEW "SYSTEM"."AQ$DEF$_AQERROR" AS SELECT q_name QUEUE, msgid MSG_ID, corrid CORR_ID, priority MSG_PRIORITY, decode(state, 0,   'READY',
                                1,   'WAIT',
                                2,   'PROCESSED',
                                3,   'EXPIRED',
                                10,  'BUFFERED_EXPIRED') MSG_STATE, cast(FROM_TZ(delay, '00:00')
                  at time zone sessiontimezone as date) DELAY, cast(FROM_TZ(delay, '00:00')
               at time zone sessiontimezone as timestamp) DELAY_TIMESTAMP, expiration, cast(FROM_TZ(enq_time, '00:00')
                  at time zone sessiontimezone as date) ENQ_TIME, cast(FROM_TZ(enq_time, '00:00')
                  at time zone sessiontimezone as timestamp) 
                  ENQ_TIMESTAMP, enq_uid ENQ_USER_ID, enq_tid ENQ_TXN_ID, cast(FROM_TZ(deq_time, '00:00')
                  at time zone sessiontimezone as date) DEQ_TIME, cast(FROM_TZ(deq_time, '00:00')
                  at time zone sessiontimezone as timestamp) 
                  DEQ_TIMESTAMP, deq_uid DEQ_USER_ID, deq_tid DEQ_TXN_ID, retry_count,  decode (state, 0, exception_qschema, 
                                  1, exception_qschema, 
                                  2, exception_qschema,  
                                  NULL) EXCEPTION_QUEUE_OWNER,  decode (state, 0, exception_queue, 
                                  1, exception_queue, 
                                  2, exception_queue,  
                                  NULL) EXCEPTION_QUEUE,  user_data,  decode (state, 3, 
                     decode (deq_tid, 'INVALID_TRANSACTION', NULL, 
                             exception_queue), NULL)
                                ORIGINAL_QUEUE_NAME,  decode (state, 3, 
                     decode (deq_tid, 'INVALID_TRANSACTION', NULL, 
                             exception_qschema), NULL)
                                ORIGINAL_QUEUE_OWNER,  decode(state, 3, 
                     decode(deq_time, NULL, 
                       decode(deq_tid, NULL,
                       decode (expiration , NULL , 'MAX_RETRY_EXCEEDED',
                            'TIME_EXPIRATION'),
                              'INVALID_TRANSACTION', NULL,
                              'MAX_RETRY_EXCEEDED'), NULL), NULL) 
                             EXPIRATION_REASON  FROM "DEF$_AQERROR" WHERE state != 7 AND   state != 9 WITH READ ONLY CONSTRAINTS "SYS_C003492";

-- ----------------------------
-- View structure for AQ$_DEF$_AQCALL_F
-- ----------------------------
CREATE OR REPLACE VIEW "SYSTEM"."AQ$_DEF$_AQCALL_F" AS SELECT  /*+ NO_MERGE (qo) USE_NL(qt) */ qt.q_name Q_NAME, qt.rowid ROW_ID, qt.msgid MSGID, qt.corrid CORRID, qt.priority PRIORITY, qt.state STATE, cast(FROM_TZ(qt.delay, '00:00') at time zone sessiontimezone as timestamp) DELAY, qt.expiration EXPIRATION, cast(FROM_TZ(qt.enq_time, '00:00') at time zone sessiontimezone as timestamp) ENQ_TIME, qt.enq_uid ENQ_UID, qt.enq_tid ENQ_TID, cast(FROM_TZ(qt.deq_time, '00:00') at time zone sessiontimezone as timestamp) DEQ_TIME, qt.deq_uid DEQ_UID, qt.deq_tid DEQ_TID, qt.retry_count RETRY_COUNT, qt.exception_qschema EXCEPTION_QSCHEMA, qt.exception_queue EXCEPTION_QUEUE, qt.cscn CSCN, qt.dscn DSCN, qt.chain_no CHAIN_NO, qt.local_order_no LOCAL_ORDER_NO, cast(FROM_TZ(qt.time_manager_info, '00:00') at time zone sessiontimezone as timestamp)   TIME_MANAGER_INFO, qt.step_no STEP_NO, qt.user_data USER_DATA , qo.qid QUEUE_ID  FROM "DEF$_AQCALL" qt, SYS.ALL_INT_DEQUEUE_QUEUES  qo  WHERE qt.q_name = qo.name AND qo.owner = 'SYSTEM' WITH READ ONLY CONSTRAINTS "SYS_C003490";

-- ----------------------------
-- View structure for AQ$_DEF$_AQERROR_F
-- ----------------------------
CREATE OR REPLACE VIEW "SYSTEM"."AQ$_DEF$_AQERROR_F" AS SELECT  /*+ NO_MERGE (qo) USE_NL(qt) */ qt.q_name Q_NAME, qt.rowid ROW_ID, qt.msgid MSGID, qt.corrid CORRID, qt.priority PRIORITY, qt.state STATE, cast(FROM_TZ(qt.delay, '00:00') at time zone sessiontimezone as timestamp) DELAY, qt.expiration EXPIRATION, cast(FROM_TZ(qt.enq_time, '00:00') at time zone sessiontimezone as timestamp) ENQ_TIME, qt.enq_uid ENQ_UID, qt.enq_tid ENQ_TID, cast(FROM_TZ(qt.deq_time, '00:00') at time zone sessiontimezone as timestamp) DEQ_TIME, qt.deq_uid DEQ_UID, qt.deq_tid DEQ_TID, qt.retry_count RETRY_COUNT, qt.exception_qschema EXCEPTION_QSCHEMA, qt.exception_queue EXCEPTION_QUEUE, qt.cscn CSCN, qt.dscn DSCN, qt.chain_no CHAIN_NO, qt.local_order_no LOCAL_ORDER_NO, cast(FROM_TZ(qt.time_manager_info, '00:00') at time zone sessiontimezone as timestamp)   TIME_MANAGER_INFO, qt.step_no STEP_NO, qt.user_data USER_DATA , qo.qid QUEUE_ID  FROM "DEF$_AQERROR" qt, SYS.ALL_INT_DEQUEUE_QUEUES  qo  WHERE qt.q_name = qo.name AND qo.owner = 'SYSTEM' WITH READ ONLY CONSTRAINTS "SYS_C003493";

-- ----------------------------
-- View structure for MVIEW_EVALUATIONS
-- ----------------------------
CREATE OR REPLACE VIEW "SYSTEM"."MVIEW_EVALUATIONS" AS select
  t1.runid# as runid,
  summary_owner AS mview_owner,
  summary_name AS mview_name,
  rank# as rank,
  storage_in_bytes,
  frequency,
  cumulative_benefit,
  benefit_to_cost_ratio
from SYSTEM.MVIEW$_ADV_OUTPUT t1, SYSTEM.MVIEW$_ADV_LOG t2, ALL_USERS u
where
  t1.runid# = t2.runid# and
  u.username = t2.uname and
  u.user_id = userenv('SCHEMAID') and
  t1.output_type = 1
order by t1.rank#;
COMMENT ON TABLE "SYSTEM"."MVIEW_EVALUATIONS" IS 'This view gives DBA access to summary evaluation output';

-- ----------------------------
-- View structure for MVIEW_EXCEPTIONS
-- ----------------------------
CREATE OR REPLACE VIEW "SYSTEM"."MVIEW_EXCEPTIONS" AS select
  t1.runid# as runid,
  owner,
  table_name,
  dimension_name,
  relationship,
  bad_rowid
from SYSTEM.MVIEW$_ADV_EXCEPTIONS t1, SYSTEM.MVIEW$_ADV_LOG t2, ALL_USERS u
where
  t1.runid# = t2.runid# and
  u.username = t2.uname and
  u.user_id = userenv('SCHEMAID');
COMMENT ON TABLE "SYSTEM"."MVIEW_EXCEPTIONS" IS 'This view gives DBA access to dimension validation results';

-- ----------------------------
-- View structure for MVIEW_FILTER
-- ----------------------------
CREATE OR REPLACE VIEW "SYSTEM"."MVIEW_FILTER" AS select
      a.filterid# as filterid,
      a.subfilternum# as subfilternum,
      decode(a.subfiltertype,1,'APPLICATION',2,'CARDINALITY',3,'LASTUSE',
                             4,'FREQUENCY',5,'USER',6,'PRIORITY',7,'BASETABLE',
                             8,'RESPONSETIME',9,'COLLECTIONID',10,'TRACENAME',
                             11,'SCHEMA','UNKNOWN') AS subfiltertype,
      a.str_value,
      to_number(decode(a.num_value1,-999,NULL,a.num_value1)) AS num_value1,
      to_number(decode(a.num_value2,-999,NULL,a.num_value2)) AS num_value2,
      a.date_value1,
      a.date_value2
   from system.mview$_adv_filter a, system.mview$_adv_log b, ALL_USERS u
   WHERE a.filterid# = b.runid#
   AND b.uname = u.username
   AND u.user_id = userenv('SCHEMAID');
COMMENT ON TABLE "SYSTEM"."MVIEW_FILTER" IS 'Workload filter records';

-- ----------------------------
-- View structure for MVIEW_FILTERINSTANCE
-- ----------------------------
CREATE OR REPLACE VIEW "SYSTEM"."MVIEW_FILTERINSTANCE" AS select
      a.runid# as runid,
      a.filterid# as filterid,
      a.subfilternum# as subfilternum,
      decode(a.subfiltertype,1,'APPLICATION',2,'CARDINALITY',3,'LASTUSE',
                             4,'FREQUENCY',5,'USER',6,'PRIORITY',7,'BASETABLE',
                             8,'RESPONSETIME',9,'COLLECTIONID',10,'TRACENAME',
                             11,'SCHEMA','UNKNOWN') AS subfiltertype,
      a.str_value,
      to_number(decode(a.num_value1,-999,NULL,a.num_value1)) AS num_value1,
      to_number(decode(a.num_value2,-999,NULL,a.num_value2)) AS num_value2,
      a.date_value1,
      a.date_value2
   from system.mview$_adv_filterinstance a;
COMMENT ON TABLE "SYSTEM"."MVIEW_FILTERINSTANCE" IS 'Workload filter instance records';

-- ----------------------------
-- View structure for MVIEW_LOG
-- ----------------------------
CREATE OR REPLACE VIEW "SYSTEM"."MVIEW_LOG" AS select
      m.runid# as id,
      m.filterid# as filterid,
      m.run_begin,
      m.run_end,
      decode(m.run_type,1,'EVALUATE',2,'EVALUATE_W',3,'RECOMMEND',
                      4,'RECOMMEND_W',5,'VALIDATE',6,'WORKLOAD',
                      7,'FILTER','UNKNOWN') AS type,
      decode(m.status,0,'UNUSED',1,'CANCELLED',2,'IN_PROGRESS',3,'COMPLETED',
                    4,'ERROR','UNKNOWN') AS status,
      m.message,
      m.completed,
      m.total,
      m.error_code
   from system.mview$_adv_log m, all_users u
   where m.uname = u.username
   and   u.user_id = userenv('SCHEMAID');
COMMENT ON TABLE "SYSTEM"."MVIEW_LOG" IS 'Advisor session log';

-- ----------------------------
-- View structure for MVIEW_RECOMMENDATIONS
-- ----------------------------
CREATE OR REPLACE VIEW "SYSTEM"."MVIEW_RECOMMENDATIONS" AS select
  t1.runid# as runid,
  t1.from_clause as all_tables,
  fact_tables,
  grouping_levels,
  query_text,
  rank# as recommendation_number,
  action_type as recommended_action,
  summary_owner as mview_owner,
  summary_name as mview_name,
  storage_in_bytes,
  pct_performance_gain,
  benefit_to_cost_ratio
from SYSTEM.MVIEW$_ADV_OUTPUT t1, SYSTEM.MVIEW$_ADV_LOG t2, ALL_USERS u
where
  t1.runid# = t2.runid# and
  u.username = t2.uname and
  u.user_id = userenv('SCHEMAID') and
  t1.output_type = 0
order by t1.rank#;
COMMENT ON TABLE "SYSTEM"."MVIEW_RECOMMENDATIONS" IS 'This view gives DBA access to summary recommendations';

-- ----------------------------
-- View structure for MVIEW_WORKLOAD
-- ----------------------------
CREATE OR REPLACE VIEW "SYSTEM"."MVIEW_WORKLOAD" AS select
  a.collectionid# as workloadid,
  a.collecttime as import_time,
  a.queryid# as queryid,
  a.application,
  a.cardinality,
  a.resultsize,
  a.qdate as lastuse,
  a.frequency,
  a.uname as owner,
  a.priority,
  a.sql_text as query,
  a.exec_time as responsetime
from SYSTEM.MVIEW$_ADV_WORKLOAD A, SYSTEM.MVIEW$_ADV_LOG B, ALL_USERS D
WHERE a.collectionid# = b.runid#
AND b.uname = d.username
AND d.user_id = userenv('SCHEMAID');
COMMENT ON TABLE "SYSTEM"."MVIEW_WORKLOAD" IS 'This view gives DBA access to shared workload';

-- ----------------------------
-- View structure for PRODUCT_PRIVS
-- ----------------------------
CREATE OR REPLACE VIEW "SYSTEM"."PRODUCT_PRIVS" AS SELECT PRODUCT, USERID, ATTRIBUTE, SCOPE,
         NUMERIC_VALUE, CHAR_VALUE, DATE_VALUE, LONG_VALUE
  FROM SQLPLUS_PRODUCT_PROFILE
  WHERE USERID = 'PUBLIC' OR USER LIKE USERID;

-- ----------------------------
-- Function structure for ORA$_SYS_REP_AUTH
-- ----------------------------
CREATE OR REPLACE
PROCEDURE "SYSTEM"."ORA$_SYS_REP_AUTH" AS
begin
  EXECUTE IMMEDIATE 'GRANT SELECT ON SYSTEM.repcat$_repschema TO SYS ' ||
                 'WITH GRANT OPTION';
  EXECUTE IMMEDIATE 'GRANT SELECT ON SYSTEM.repcat$_repprop TO SYS ' ||
                 'WITH GRANT OPTION';
  EXECUTE IMMEDIATE 'GRANT SELECT ON SYSTEM.def$_aqcall TO SYS ' ||
                 'WITH GRANT OPTION';
  EXECUTE IMMEDIATE 'GRANT SELECT ON SYSTEM.def$_calldest TO SYS ' ||
                 'WITH GRANT OPTION';
  EXECUTE IMMEDIATE 'GRANT SELECT ON SYSTEM.def$_error TO SYS ' ||
                 'WITH GRANT OPTION';
  EXECUTE IMMEDIATE 'GRANT SELECT ON SYSTEM.def$_destination TO SYS ' ||
                 'WITH GRANT OPTION';
end;
/

-- ----------------------------
-- Sequence structure for DEMO_SEQ
-- ----------------------------
DROP SEQUENCE "SYSTEM"."DEMO_SEQ";
CREATE SEQUENCE "SYSTEM"."DEMO_SEQ" MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 NOCACHE;

-- ----------------------------
-- Sequence structure for LOGMNR_EVOLVE_SEQ$
-- ----------------------------
DROP SEQUENCE "SYSTEM"."LOGMNR_EVOLVE_SEQ$";
CREATE SEQUENCE "SYSTEM"."LOGMNR_EVOLVE_SEQ$" MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 ORDER NOCACHE;

-- ----------------------------
-- Sequence structure for LOGMNR_SEQ$
-- ----------------------------
DROP SEQUENCE "SYSTEM"."LOGMNR_SEQ$";
CREATE SEQUENCE "SYSTEM"."LOGMNR_SEQ$" MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 ORDER NOCACHE;

-- ----------------------------
-- Sequence structure for LOGMNR_UIDS$
-- ----------------------------
DROP SEQUENCE "SYSTEM"."LOGMNR_UIDS$";
CREATE SEQUENCE "SYSTEM"."LOGMNR_UIDS$" MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 ORDER NOCACHE;

-- ----------------------------
-- Sequence structure for MVIEW$_ADVSEQ_GENERIC
-- ----------------------------
DROP SEQUENCE "SYSTEM"."MVIEW$_ADVSEQ_GENERIC";
CREATE SEQUENCE "SYSTEM"."MVIEW$_ADVSEQ_GENERIC" MINVALUE 1 MAXVALUE 4294967295 INCREMENT BY 1 CACHE 50;

-- ----------------------------
-- Sequence structure for MVIEW$_ADVSEQ_ID
-- ----------------------------
DROP SEQUENCE "SYSTEM"."MVIEW$_ADVSEQ_ID";
CREATE SEQUENCE "SYSTEM"."MVIEW$_ADVSEQ_ID" MINVALUE 1 MAXVALUE 4294967295 INCREMENT BY 1 CACHE 20;

-- ----------------------------
-- Sequence structure for REPCAT$_EXCEPTIONS_S
-- ----------------------------
DROP SEQUENCE "SYSTEM"."REPCAT$_EXCEPTIONS_S";
CREATE SEQUENCE "SYSTEM"."REPCAT$_EXCEPTIONS_S" MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 CACHE 20;

-- ----------------------------
-- Sequence structure for REPCAT$_FLAVORS_S
-- ----------------------------
DROP SEQUENCE "SYSTEM"."REPCAT$_FLAVORS_S";
CREATE SEQUENCE "SYSTEM"."REPCAT$_FLAVORS_S" MINVALUE -2147483647 MAXVALUE 2147483647 INCREMENT BY 1 NOCACHE;

-- ----------------------------
-- Sequence structure for REPCAT$_FLAVOR_NAME_S
-- ----------------------------
DROP SEQUENCE "SYSTEM"."REPCAT$_FLAVOR_NAME_S";
CREATE SEQUENCE "SYSTEM"."REPCAT$_FLAVOR_NAME_S" MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 NOCACHE;

-- ----------------------------
-- Sequence structure for REPCAT$_REFRESH_TEMPLATES_S
-- ----------------------------
DROP SEQUENCE "SYSTEM"."REPCAT$_REFRESH_TEMPLATES_S";
CREATE SEQUENCE "SYSTEM"."REPCAT$_REFRESH_TEMPLATES_S" MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 CACHE 20;

-- ----------------------------
-- Sequence structure for REPCAT$_REPPROP_KEY
-- ----------------------------
DROP SEQUENCE "SYSTEM"."REPCAT$_REPPROP_KEY";
CREATE SEQUENCE "SYSTEM"."REPCAT$_REPPROP_KEY" MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 CACHE 20;

-- ----------------------------
-- Sequence structure for REPCAT$_RUNTIME_PARMS_S
-- ----------------------------
DROP SEQUENCE "SYSTEM"."REPCAT$_RUNTIME_PARMS_S";
CREATE SEQUENCE "SYSTEM"."REPCAT$_RUNTIME_PARMS_S" MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 CACHE 20;

-- ----------------------------
-- Sequence structure for REPCAT$_TEMPLATE_OBJECTS_S
-- ----------------------------
DROP SEQUENCE "SYSTEM"."REPCAT$_TEMPLATE_OBJECTS_S";
CREATE SEQUENCE "SYSTEM"."REPCAT$_TEMPLATE_OBJECTS_S" MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 CACHE 20;

-- ----------------------------
-- Sequence structure for REPCAT$_TEMPLATE_PARMS_S
-- ----------------------------
DROP SEQUENCE "SYSTEM"."REPCAT$_TEMPLATE_PARMS_S";
CREATE SEQUENCE "SYSTEM"."REPCAT$_TEMPLATE_PARMS_S" MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 CACHE 20;

-- ----------------------------
-- Sequence structure for REPCAT$_TEMPLATE_REFGROUPS_S
-- ----------------------------
DROP SEQUENCE "SYSTEM"."REPCAT$_TEMPLATE_REFGROUPS_S";
CREATE SEQUENCE "SYSTEM"."REPCAT$_TEMPLATE_REFGROUPS_S" MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 CACHE 20;

-- ----------------------------
-- Sequence structure for REPCAT$_TEMPLATE_SITES_S
-- ----------------------------
DROP SEQUENCE "SYSTEM"."REPCAT$_TEMPLATE_SITES_S";
CREATE SEQUENCE "SYSTEM"."REPCAT$_TEMPLATE_SITES_S" MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 CACHE 20;

-- ----------------------------
-- Sequence structure for REPCAT$_TEMP_OUTPUT_S
-- ----------------------------
DROP SEQUENCE "SYSTEM"."REPCAT$_TEMP_OUTPUT_S";
CREATE SEQUENCE "SYSTEM"."REPCAT$_TEMP_OUTPUT_S" MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 CACHE 20;

-- ----------------------------
-- Sequence structure for REPCAT$_USER_AUTHORIZATIONS_S
-- ----------------------------
DROP SEQUENCE "SYSTEM"."REPCAT$_USER_AUTHORIZATIONS_S";
CREATE SEQUENCE "SYSTEM"."REPCAT$_USER_AUTHORIZATIONS_S" MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 CACHE 20;

-- ----------------------------
-- Sequence structure for REPCAT$_USER_PARM_VALUES_S
-- ----------------------------
DROP SEQUENCE "SYSTEM"."REPCAT$_USER_PARM_VALUES_S";
CREATE SEQUENCE "SYSTEM"."REPCAT$_USER_PARM_VALUES_S" MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 CACHE 20;

-- ----------------------------
-- Sequence structure for REPCAT_LOG_SEQUENCE
-- ----------------------------
DROP SEQUENCE "SYSTEM"."REPCAT_LOG_SEQUENCE";
CREATE SEQUENCE "SYSTEM"."REPCAT_LOG_SEQUENCE" MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 CACHE 20;

-- ----------------------------
-- Sequence structure for TEMPLATE$_TARGETS_S
-- ----------------------------
DROP SEQUENCE "SYSTEM"."TEMPLATE$_TARGETS_S";
CREATE SEQUENCE "SYSTEM"."TEMPLATE$_TARGETS_S" MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 CACHE 20;

-- ----------------------------
-- Primary Key structure for table DEF$_AQCALL
-- ----------------------------
ALTER TABLE "SYSTEM"."DEF$_AQCALL" ADD CONSTRAINT "SYS_C003488" PRIMARY KEY ("ENQ_TID", "STEP_NO");

-- ----------------------------
-- Indexes structure for table DEF$_AQCALL
-- ----------------------------
CREATE INDEX "SYSTEM"."DEF$_TRANORDER"
  ON "SYSTEM"."DEF$_AQCALL" ("CSCN" ASC, "ENQ_TID" ASC)
  LOGGING
  VISIBLE
PCTFREE 10
INITRANS 2
STORAGE (
  INITIAL 65536 
  NEXT 1048576 
  MINEXTENTS 1
  MAXEXTENTS 2147483645
  FREELISTS 1
  FREELIST GROUPS 1
  BUFFER_POOL DEFAULT
);

-- ----------------------------
-- Primary Key structure for table DEF$_AQERROR
-- ----------------------------
ALTER TABLE "SYSTEM"."DEF$_AQERROR" ADD CONSTRAINT "SYS_C003491" PRIMARY KEY ("ENQ_TID", "STEP_NO");

-- ----------------------------
-- Checks structure for table EVENT_EXECUTION
-- ----------------------------
ALTER TABLE "SYSTEM"."EVENT_EXECUTION" ADD CONSTRAINT "SYS_C0012196" CHECK ("EVENT_HANDLER_NAME" IS NOT NULL) NOT DEFERRABLE INITIALLY IMMEDIATE NORELY VALIDATE;
ALTER TABLE "SYSTEM"."EVENT_EXECUTION" ADD CONSTRAINT "SYS_C0012197" CHECK ("EVENT_NAME" IS NOT NULL) NOT DEFERRABLE INITIALLY IMMEDIATE NORELY VALIDATE;
ALTER TABLE "SYSTEM"."EVENT_EXECUTION" ADD CONSTRAINT "SYS_C0012198" CHECK ("MESSAGE_ID" IS NOT NULL) NOT DEFERRABLE INITIALLY IMMEDIATE NORELY VALIDATE;
ALTER TABLE "SYSTEM"."EVENT_EXECUTION" ADD CONSTRAINT "SYS_C0012199" CHECK ("EXECUTION_ID" IS NOT NULL) NOT DEFERRABLE INITIALLY IMMEDIATE NORELY VALIDATE;
ALTER TABLE "SYSTEM"."EVENT_EXECUTION" ADD CONSTRAINT "SYS_C0012200" CHECK ("JSON_DATA" IS NOT NULL) NOT DEFERRABLE INITIALLY IMMEDIATE NORELY VALIDATE;

-- ----------------------------
-- Checks structure for table META_EVENT_HANDLE
-- ----------------------------
ALTER TABLE "SYSTEM"."META_EVENT_HANDLE" ADD CONSTRAINT "SYS_C0012201" CHECK ("id" IS NOT NULL) NOT DEFERRABLE INITIALLY IMMEDIATE NORELY VALIDATE;
ALTER TABLE "SYSTEM"."META_EVENT_HANDLE" ADD CONSTRAINT "SYS_C0012202" CHECK ("name" IS NOT NULL) NOT DEFERRABLE INITIALLY IMMEDIATE NORELY VALIDATE;
ALTER TABLE "SYSTEM"."META_EVENT_HANDLE" ADD CONSTRAINT "SYS_C0012203" CHECK ("event" IS NOT NULL) NOT DEFERRABLE INITIALLY IMMEDIATE NORELY VALIDATE;
ALTER TABLE "SYSTEM"."META_EVENT_HANDLE" ADD CONSTRAINT "SYS_C0012204" CHECK ("active" IS NOT NULL) NOT DEFERRABLE INITIALLY IMMEDIATE NORELY VALIDATE;
ALTER TABLE "SYSTEM"."META_EVENT_HANDLE" ADD CONSTRAINT "SYS_C0012205" CHECK ("json_data" IS NOT NULL) NOT DEFERRABLE INITIALLY IMMEDIATE NORELY VALIDATE;

-- ----------------------------
-- Checks structure for table META_TASK_DEF
-- ----------------------------
ALTER TABLE "SYSTEM"."META_TASK_DEF" ADD CONSTRAINT "SYS_C0012206" CHECK ("name" IS NOT NULL) NOT DEFERRABLE INITIALLY IMMEDIATE NORELY VALIDATE;
ALTER TABLE "SYSTEM"."META_TASK_DEF" ADD CONSTRAINT "SYS_C0012207" CHECK ("json_data" IS NOT NULL) NOT DEFERRABLE INITIALLY IMMEDIATE NORELY VALIDATE;

-- ----------------------------
-- Checks structure for table META_WORKFLOW_DEF
-- ----------------------------
ALTER TABLE "SYSTEM"."META_WORKFLOW_DEF" ADD CONSTRAINT "SYS_C0012208" CHECK ("name" IS NOT NULL) NOT DEFERRABLE INITIALLY IMMEDIATE NORELY VALIDATE;
ALTER TABLE "SYSTEM"."META_WORKFLOW_DEF" ADD CONSTRAINT "SYS_C0012209" CHECK ("version" IS NOT NULL) NOT DEFERRABLE INITIALLY IMMEDIATE NORELY VALIDATE;
ALTER TABLE "SYSTEM"."META_WORKFLOW_DEF" ADD CONSTRAINT "SYS_C0012210" CHECK ("latest_version" IS NOT NULL) NOT DEFERRABLE INITIALLY IMMEDIATE NORELY VALIDATE;
ALTER TABLE "SYSTEM"."META_WORKFLOW_DEF" ADD CONSTRAINT "SYS_C0012211" CHECK ("json_data" IS NOT NULL) NOT DEFERRABLE INITIALLY IMMEDIATE NORELY VALIDATE;

-- ----------------------------
-- Checks structure for table POLL_DATA
-- ----------------------------
ALTER TABLE "SYSTEM"."POLL_DATA" ADD CONSTRAINT "SYS_C0012212" CHECK ("queue_name" IS NOT NULL) NOT DEFERRABLE INITIALLY IMMEDIATE NORELY VALIDATE;
ALTER TABLE "SYSTEM"."POLL_DATA" ADD CONSTRAINT "SYS_C0012213" CHECK ("domain" IS NOT NULL) NOT DEFERRABLE INITIALLY IMMEDIATE NORELY VALIDATE;
ALTER TABLE "SYSTEM"."POLL_DATA" ADD CONSTRAINT "SYS_C0012214" CHECK ("json_data" IS NOT NULL) NOT DEFERRABLE INITIALLY IMMEDIATE NORELY VALIDATE;

-- ----------------------------
-- Checks structure for table QUEUE
-- ----------------------------
ALTER TABLE "SYSTEM"."QUEUE" ADD CONSTRAINT "SYS_C0012239" CHECK ("QUEUE_NAME" IS NOT NULL) NOT DEFERRABLE INITIALLY IMMEDIATE NORELY VALIDATE;

-- ----------------------------
-- Checks structure for table QUEUE_MESSAGE
-- ----------------------------
ALTER TABLE "SYSTEM"."QUEUE_MESSAGE" ADD CONSTRAINT "SYS_C0012215" CHECK ("created_on" IS NOT NULL) NOT DEFERRABLE INITIALLY IMMEDIATE NORELY VALIDATE;
ALTER TABLE "SYSTEM"."QUEUE_MESSAGE" ADD CONSTRAINT "SYS_C0012216" CHECK ("queue_name" IS NOT NULL) NOT DEFERRABLE INITIALLY IMMEDIATE NORELY VALIDATE;
ALTER TABLE "SYSTEM"."QUEUE_MESSAGE" ADD CONSTRAINT "SYS_C0012217" CHECK ("message_id" IS NOT NULL) NOT DEFERRABLE INITIALLY IMMEDIATE NORELY VALIDATE;

-- ----------------------------
-- Checks structure for table TASK
-- ----------------------------
ALTER TABLE "SYSTEM"."TASK" ADD CONSTRAINT "SYS_C0012218" CHECK ("task_id" IS NOT NULL) NOT DEFERRABLE INITIALLY IMMEDIATE NORELY VALIDATE;
ALTER TABLE "SYSTEM"."TASK" ADD CONSTRAINT "SYS_C0012219" CHECK ("json_data" IS NOT NULL) NOT DEFERRABLE INITIALLY IMMEDIATE NORELY VALIDATE;

-- ----------------------------
-- Checks structure for table TASK_IN_PROGRESS
-- ----------------------------
ALTER TABLE "SYSTEM"."TASK_IN_PROGRESS" ADD CONSTRAINT "SYS_C0012220" CHECK ("task_def_name" IS NOT NULL) NOT DEFERRABLE INITIALLY IMMEDIATE NORELY VALIDATE;
ALTER TABLE "SYSTEM"."TASK_IN_PROGRESS" ADD CONSTRAINT "SYS_C0012221" CHECK ("task_id" IS NOT NULL) NOT DEFERRABLE INITIALLY IMMEDIATE NORELY VALIDATE;
ALTER TABLE "SYSTEM"."TASK_IN_PROGRESS" ADD CONSTRAINT "SYS_C0012222" CHECK ("workflow_id" IS NOT NULL) NOT DEFERRABLE INITIALLY IMMEDIATE NORELY VALIDATE;
ALTER TABLE "SYSTEM"."TASK_IN_PROGRESS" ADD CONSTRAINT "SYS_C0012223" CHECK ("in_progress_status" IS NOT NULL) NOT DEFERRABLE INITIALLY IMMEDIATE NORELY VALIDATE;

-- ----------------------------
-- Checks structure for table TASK_SCHEDULED
-- ----------------------------
ALTER TABLE "SYSTEM"."TASK_SCHEDULED" ADD CONSTRAINT "SYS_C0012224" CHECK ("workflow_id" IS NOT NULL) NOT DEFERRABLE INITIALLY IMMEDIATE NORELY VALIDATE;
ALTER TABLE "SYSTEM"."TASK_SCHEDULED" ADD CONSTRAINT "SYS_C0012225" CHECK ("task_key" IS NOT NULL) NOT DEFERRABLE INITIALLY IMMEDIATE NORELY VALIDATE;
ALTER TABLE "SYSTEM"."TASK_SCHEDULED" ADD CONSTRAINT "SYS_C0012226" CHECK ("task_id" IS NOT NULL) NOT DEFERRABLE INITIALLY IMMEDIATE NORELY VALIDATE;

-- ----------------------------
-- Checks structure for table WORKFLOW
-- ----------------------------
ALTER TABLE "SYSTEM"."WORKFLOW" ADD CONSTRAINT "SYS_C0012227" CHECK ("workflow_id" IS NOT NULL) NOT DEFERRABLE INITIALLY IMMEDIATE NORELY VALIDATE;
ALTER TABLE "SYSTEM"."WORKFLOW" ADD CONSTRAINT "SYS_C0012228" CHECK ("json_data" IS NOT NULL) NOT DEFERRABLE INITIALLY IMMEDIATE NORELY VALIDATE;

-- ----------------------------
-- Checks structure for table WORKFLOW_DEF_TO_WORKFLOW
-- ----------------------------
ALTER TABLE "SYSTEM"."WORKFLOW_DEF_TO_WORKFLOW" ADD CONSTRAINT "SYS_C0012240" CHECK ("workflow_def" IS NOT NULL) NOT DEFERRABLE INITIALLY IMMEDIATE NORELY VALIDATE;
ALTER TABLE "SYSTEM"."WORKFLOW_DEF_TO_WORKFLOW" ADD CONSTRAINT "SYS_C0012241" CHECK ("date_str" IS NOT NULL) NOT DEFERRABLE INITIALLY IMMEDIATE NORELY VALIDATE;
ALTER TABLE "SYSTEM"."WORKFLOW_DEF_TO_WORKFLOW" ADD CONSTRAINT "SYS_C0012242" CHECK ("workflow_id" IS NOT NULL) NOT DEFERRABLE INITIALLY IMMEDIATE NORELY VALIDATE;

-- ----------------------------
-- Checks structure for table WORKFLOW_PENDING
-- ----------------------------
ALTER TABLE "SYSTEM"."WORKFLOW_PENDING" ADD CONSTRAINT "SYS_C0012229" CHECK ("workflow_type" IS NOT NULL) NOT DEFERRABLE INITIALLY IMMEDIATE NORELY VALIDATE;
ALTER TABLE "SYSTEM"."WORKFLOW_PENDING" ADD CONSTRAINT "SYS_C0012230" CHECK ("workflow_id" IS NOT NULL) NOT DEFERRABLE INITIALLY IMMEDIATE NORELY VALIDATE;

-- ----------------------------
-- Checks structure for table WORKFLOW_TO_TASK
-- ----------------------------
ALTER TABLE "SYSTEM"."WORKFLOW_TO_TASK" ADD CONSTRAINT "SYS_C0012231" CHECK ("workflow_id" IS NOT NULL) NOT DEFERRABLE INITIALLY IMMEDIATE NORELY VALIDATE;
ALTER TABLE "SYSTEM"."WORKFLOW_TO_TASK" ADD CONSTRAINT "SYS_C0012232" CHECK ("task_id" IS NOT NULL) NOT DEFERRABLE INITIALLY IMMEDIATE NORELY VALIDATE;
