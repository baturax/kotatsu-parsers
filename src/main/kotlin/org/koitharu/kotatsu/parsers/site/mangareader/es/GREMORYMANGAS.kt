package org.koitharu.kotatsu.parsers.site.mangareader.es

import org.koitharu.kotatsu.parsers.MangaLoaderContext
import org.koitharu.kotatsu.parsers.MangaSourceParser
import org.koitharu.kotatsu.parsers.config.ConfigKey
import org.koitharu.kotatsu.parsers.model.MangaSource
import org.koitharu.kotatsu.parsers.site.mangareader.MangaReaderParser
import java.text.SimpleDateFormat
import java.util.*

@MangaSourceParser("GREMORYMANGAS", "Gremory Mangas", "es")
internal class GREMORYMANGAS(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaSource.GREMORYMANGAS, pageSize = 20, searchPageSize = 20) {
	override val configKeyDomain: ConfigKey.Domain
		get() = ConfigKey.Domain("gremorymangas.com")

	override val listUrl: String get() = "/manga"

	override val tableMode: Boolean
		get() = true

	override val chapterDateFormat: SimpleDateFormat = SimpleDateFormat("MMMM d, yyyy", Locale("es", "ES"))
}
