package com.example.teaja.sqlTracNghiem;

import android.provider.BaseColumns;

public final class Table {
    private Table(){}

    public static class catolyTracNghiem implements BaseColumns {
        // du lieu bang catalory
        public static final String TABLE_NAME = "catalories";
        public static final String COLUMN_NAME = "name";
    }
    public static class catolyQuestion implements BaseColumns {
        // du lieu bang question
        public static final String TABLE_NAME = "questions";//ten bang
        public static final String COLUMN_QUETION = "question";//cau hoi

        public static final String COLUMN_OPTION1 = "option1";//4 cau tra loi lua chon
        public static final String COLUMN_OPTION2 = "option2";
        public static final String COLUMN_OPTION3 = "option3";
        public static final String COLUMN_OPTION4 = "option4";

        public static final String COLUMN_ANSWER = "answer"; //dap an

        public static final String COLUMN_CATALORIES = "id_catalories";// id chuyen muc
    }
}
