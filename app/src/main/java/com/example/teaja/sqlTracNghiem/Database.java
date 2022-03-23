package com.example.teaja.sqlTracNghiem;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

import layoufavorite.DetaileCa1;


public class Database extends SQLiteOpenHelper {
    //ten database
    public static final String DATABASE_NAME = "Question.db";
    //version
    public static final int VERSION = 1;

    private SQLiteDatabase db;


    public Database(@Nullable Context context) {
        super(context, DATABASE_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        this.db = db;

        final String CATALORIES_TABLE = "CREATE TABLE " +
                Table.catolyTracNghiem.TABLE_NAME + "(" +
                Table.catolyTracNghiem._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                Table.catolyTracNghiem.COLUMN_NAME + " TEXT " + ")";

        final String QUESTIONS_TABLE = "CREATE TABLE " +
                Table.catolyQuestion.TABLE_NAME + "(" +
                Table.catolyQuestion._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                Table.catolyQuestion.COLUMN_QUETION + " TEXT, " +
                Table.catolyQuestion.COLUMN_OPTION1 + " TEXT, " +
                Table.catolyQuestion.COLUMN_OPTION2 + " TEXT, " +
                Table.catolyQuestion.COLUMN_OPTION3 + " TEXT, " +
                Table.catolyQuestion.COLUMN_OPTION4 + " TEXT, " +
                Table.catolyQuestion.COLUMN_ANSWER + " INTEGER, " +
                Table.catolyQuestion.COLUMN_CATALORIES + " INTEGER, " +
                "FOREIGN KEY(" + Table.catolyQuestion.COLUMN_CATALORIES + ") REFERENCES " +
                Table.catolyQuestion.TABLE_NAME + "(" + Table.catolyTracNghiem._ID + ")" + "ON DELETE CASCADE " + ")";

        // tao bang
        db.execSQL(CATALORIES_TABLE);
        db.execSQL(QUESTIONS_TABLE);
        //insert su lieu
        CreateCatalory();
        CreateQuetion();
        //CreateQuetion3();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + Table.catolyTracNghiem.COLUMN_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + Table.catolyQuestion.TABLE_NAME);

        onCreate(db);
    }
    private void insertCataloRyTN(Cataloties cataloties){// insert chu de vao co su lieu
        ContentValues values = new ContentValues();
        values.put(Table.catolyTracNghiem.COLUMN_NAME, cataloties.getName());
        db.insert(Table.catolyTracNghiem.TABLE_NAME, null, values);
    }

    private void CreateCatalory(){//cac gia tri insert
        Cataloties c1 = new Cataloties("N5");// id 1
        insertCataloRyTN(c1);

        Cataloties c2 = new Cataloties("N4"); //id 2
        insertCataloRyTN(c2);

        Cataloties c3 = new Cataloties("N3"); // id 3
        insertCataloRyTN(c3);

        Cataloties c4 = new Cataloties("N2"); // id 4
        insertCataloRyTN(c4);

        Cataloties c5 = new Cataloties("N1"); // id 5
        insertCataloRyTN(c5);
    }

    private void insertQuestion(Question question){//insert cau hoi va dap an vao co so du lieu
        ContentValues values = new ContentValues();
        values.put(Table.catolyQuestion.COLUMN_QUETION, question.getQuestion());
        values.put(Table.catolyQuestion.COLUMN_OPTION1, question.getOption1());
        values.put(Table.catolyQuestion.COLUMN_OPTION2, question.getOption2());
        values.put(Table.catolyQuestion.COLUMN_OPTION3, question.getOption3());
        values.put(Table.catolyQuestion.COLUMN_OPTION4, question.getOption4());
        values.put(Table.catolyQuestion.COLUMN_QUETION, question.getQuestion());
        values.put(Table.catolyQuestion.COLUMN_ANSWER, question.getAnswer());
        values.put(Table.catolyQuestion.COLUMN_CATALORIES, question.getCataloryID());
        db.insert(Table.catolyQuestion.TABLE_NAME, null, values);
    }

    private void CreateQuetion(){//tao bang cau hoi
        //id chu de
        Question q1 = new Question("あなたがここにきてから、わたしのしごとが（－－－）いくようになったんですよ。",
                        "A. うまく",
                        "B. からく",
                        "C. あまく",
                        "D. おもく", 1, 1 );
        insertQuestion(q1);

        Question q2 = new Question("このさいふはふるいですが、とても　（－－－）。",
                "A. じょうぶです",
                "B. げんきです",
                "C. にぎやかです",
                "D. しずかです", 1, 1 );
        insertQuestion(q2);

        Question q3 = new Question("その（－－－）はきゃくがいっぱいいるね。",
                "A. エレベーター",
                "B. レストラン",
                "C. テーブル",
                "D. ソックス", 2, 1 );
        insertQuestion(q3);

        Question q4 = new Question("もう9じですね。（－－－）しつれいします。",
                "A. もう",
                "B. ちょうど",
                "C. すぐ",
                "D. そろそろ", 4, 1 );
        insertQuestion(q4);

        Question q5 = new Question("もう9じですね。（－－－）しつれいします。",
                "A. さびしい",
                "B. きびしい",
                "C. やさしい",
                "D. むずかしい", 4, 1 );
        insertQuestion(q5);

        Question q6 = new Question("ぎんこうはどこですか。\n" +
                "このみちを（－－－）いってください。すぐそこですよ。",
                "A. まっすぐ",
                "B. ちょうど",
                "C. はじめに",
                "D. まえに", 1, 1 );
        insertQuestion(q6);

        Question q7 = new Question("（－－－）ぼうしをかいました。",
                "A. にがい",
                "B. あまい",
                "C. あおい",
                "D. おもい", 3, 1 );
        insertQuestion(q7);

        Question q8 = new Question("テストはおわりました。きょうしつを（－－－）ください。",
                "A. べんきょうして",
                "B. でて",
                "C. かえって",
                "D. すわって", 2, 1 );
        insertQuestion(q8);

        Question q9 = new Question("かいしゃからえきまであるいて10ふん　（－－－）。",
                "A. かけます",
                "B. かかります",
                "C. いります",
                "D. あります", 2, 1 );
        insertQuestion(q9);

        Question q10 = new Question("いえにはとりが（－－－）います。",
                "A. にひき",
                "B. にこ",
                "C. にほん",
                "D. にだい", 1, 1 );
        insertQuestion(q10);

        Question q11 = new Question("ミンさんのおばさんはあのひとです。",
                "A. ミンさんのおかあさんのおとうとさんはあのひとです",
                "B. ミンさんのおかあさんのおとうさんはあのひとです",
                "C. ミンさんのおかあさんのおかあさんはあのひとです",
                "D. ミンさんのおかあさんのいもうとさんはあのひとです", 4, 2 );
        insertQuestion(q11);

        Question q12 = new Question("このしょうせつはおもしろくないです。",
                "A. このしょうせつはむずかしいです",
                "B. このしょうせつはつまらないです",
                "C. このしょうせつはみじかいです",
                "D. このしょうせつはながいです", 2, 2 );
        insertQuestion(q12);

        Question q13 = new Question("きょうはてんきがいいです",
                "A. きょうははれています",
                "B. きょうはゆきがふっています",
                "C. きょうはあめがふっています",
                "D.  きょうはくもっています", 1, 2 );
        insertQuestion(q13);

        Question q14 = new Question("よるこうえんをさんぽしました。",
                "A. よるこうえんをあるきました",
                "B. よるこうえんをとびました",
                "C. よるこうえんをまがりました",
                "D. よるこうえんをはしりました", 1, 2 );
        insertQuestion(q14);

        Question q15 = new Question("わたしのいもうとはミンさんとけっこんします",
                "A. いもうとはミンさんのおばさんになります",
                "B. いもうとはミンさんのごしゅじんになります",
                "C. いもうとはミンさんのおくさんになります",
                "D. いもうとはミンさんのあねになります", 3, 2 );
        insertQuestion(q15);
    }

    @SuppressLint("Range")// ham tra ve du lieu cac chu de
    public List<Cataloties> getDataCatalotiesList(){
        List<Cataloties> list = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM " + Table.catolyTracNghiem.TABLE_NAME, null);
        if (c.moveToFirst()){
            do {
                Cataloties cataloties = new Cataloties();
                cataloties.setId(c.getInt(c.getColumnIndex(Table.catolyTracNghiem._ID)));
                cataloties.setName(c.getString(c.getColumnIndex(Table.catolyTracNghiem.COLUMN_NAME)));
                list.add(cataloties);
            }while (c.moveToNext());
        }
        c.close();
        return list;
    }
    //lay du lieu cau hoi va dap an int id = id_Catalory theo chu de da chon
    @SuppressLint("Range")
    public ArrayList<Question> getQuestion(int CataloryID) {
        ArrayList<Question> list = new ArrayList<>();
        db = getReadableDatabase();
        String selection = Table.catolyQuestion.COLUMN_CATALORIES + " = ? ";
        String[] args = new String[]{String.valueOf(CataloryID)};

        Cursor c = db.query(Table.catolyQuestion.TABLE_NAME, null,
                selection, args, null, null, null);
        if (c.moveToFirst()) {
            do {
                Question question = new Question();
                question.setId(c.getInt(c.getColumnIndex(Table.catolyQuestion._ID)));
                question.setQuestion(c.getString(c.getColumnIndex(Table.catolyQuestion.COLUMN_QUETION)));
                question.setOption1(c.getString(c.getColumnIndex(Table.catolyQuestion.COLUMN_OPTION1)));
                question.setOption2(c.getString(c.getColumnIndex(Table.catolyQuestion.COLUMN_OPTION2)));
                question.setOption3(c.getString(c.getColumnIndex(Table.catolyQuestion.COLUMN_OPTION3)));
                question.setOption4(c.getString(c.getColumnIndex(Table.catolyQuestion.COLUMN_OPTION4)));
                question.setAnswer(c.getInt(c.getColumnIndex(Table.catolyQuestion.COLUMN_ANSWER)));
                question.setCataloryID(c.getInt(c.getColumnIndex(Table.catolyQuestion.COLUMN_CATALORIES)));

                list.add(question);
            } while (c.moveToNext());
        }
            c.close();
            return list;
        }
}
