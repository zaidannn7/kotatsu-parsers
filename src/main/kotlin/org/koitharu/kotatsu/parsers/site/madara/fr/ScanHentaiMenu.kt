package org.koitharu.kotatsu.parsers.site.madara.fr

import org.koitharu.kotatsu.parsers.MangaLoaderContext
import org.koitharu.kotatsu.parsers.MangaSourceParser
import org.koitharu.kotatsu.parsers.model.MangaSource
import org.koitharu.kotatsu.parsers.site.madara.MadaraParser

@MangaSourceParser("SCANHENTAIMENU", "Scan Hentai Menu", "fr")
internal class ScanHentaiMenu(context: MangaLoaderContext) :
	MadaraParser(context, MangaSource.SCANHENTAIMENU, "scan.hentai.menu") {

	override val isNsfwSource = true
}
