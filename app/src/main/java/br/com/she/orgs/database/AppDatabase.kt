package br.com.she.orgs.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import br.com.she.orgs.database.converter.Converters
import br.com.she.orgs.database.dao.ProdutoDao
import br.com.she.orgs.model.Produto

@Database(entities = [Produto::class], version = 1)
@TypeConverters(Converters::class)
abstract class AppDatabase : RoomDatabase() {
    abstract fun produtoDao(): ProdutoDao
}
