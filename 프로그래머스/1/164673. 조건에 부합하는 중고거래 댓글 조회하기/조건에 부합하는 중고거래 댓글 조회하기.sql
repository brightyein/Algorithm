SELECT TITLE, UGB.BOARD_ID, REPLY_ID, USED_GOODS_REPLY.WRITER_ID, USED_GOODS_REPLY .CONTENTS, DATE_FORMAT(USED_GOODS_REPLY.CREATED_DATE, '%Y-%m-%d') AS CREATED_DATE
FROM USED_GOODS_BOARD AS UGB
INNER JOIN USED_GOODS_REPLY ON UGB.BOARD_ID = USED_GOODS_REPLY.BOARD_ID
WHERE DATE_FORMAT(UGB.CREATED_DATE, '%Y-%m')='2022-10'
ORDER BY USED_GOODS_REPLY.CREATED_DATE ASC, TITLE ASC;