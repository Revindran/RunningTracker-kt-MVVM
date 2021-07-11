package com.raveendran.runningapp.db;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import javax.annotation.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class RunnerDatabase_Impl extends RunnerDatabase {
  private volatile RunDAO _runDAO;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `runner_table` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `img` BLOB, `timeStamp` INTEGER NOT NULL, `timeInMillis` INTEGER NOT NULL, `avgSpeedInKmpl` REAL NOT NULL, `distanceInMeter` INTEGER NOT NULL, `caloriesBurned` INTEGER NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c86c15dccb22cef99e53abb0ab06fb13')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `runner_table`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsRunnerTable = new HashMap<String, TableInfo.Column>(7);
        _columnsRunnerTable.put("id", new TableInfo.Column("id", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRunnerTable.put("img", new TableInfo.Column("img", "BLOB", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRunnerTable.put("timeStamp", new TableInfo.Column("timeStamp", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRunnerTable.put("timeInMillis", new TableInfo.Column("timeInMillis", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRunnerTable.put("avgSpeedInKmpl", new TableInfo.Column("avgSpeedInKmpl", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRunnerTable.put("distanceInMeter", new TableInfo.Column("distanceInMeter", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRunnerTable.put("caloriesBurned", new TableInfo.Column("caloriesBurned", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysRunnerTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesRunnerTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoRunnerTable = new TableInfo("runner_table", _columnsRunnerTable, _foreignKeysRunnerTable, _indicesRunnerTable);
        final TableInfo _existingRunnerTable = TableInfo.read(_db, "runner_table");
        if (! _infoRunnerTable.equals(_existingRunnerTable)) {
          return new RoomOpenHelper.ValidationResult(false, "runner_table(com.raveendran.runningapp.db.Run).\n"
                  + " Expected:\n" + _infoRunnerTable + "\n"
                  + " Found:\n" + _existingRunnerTable);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "c86c15dccb22cef99e53abb0ab06fb13", "18c6ee4016d0d7057f71063acd1c2b42");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "runner_table");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `runner_table`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public RunDAO getRunDao() {
    if (_runDAO != null) {
      return _runDAO;
    } else {
      synchronized(this) {
        if(_runDAO == null) {
          _runDAO = new RunDAO_Impl(this);
        }
        return _runDAO;
      }
    }
  }
}
