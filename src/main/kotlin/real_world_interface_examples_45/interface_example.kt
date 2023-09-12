package real_world_interface_examples_45


fun getFileSystem():FileSystem{
    return Fat32FileSystem()
}
fun main() {

    val fileSystem:FileSystem = getFileSystem()

    fileSystem.readDir("~/Library/new_file.text")
    val fileData =  fileSystem.readFile("~/User/doc.docx")

    println(fileData)

}


interface FileSystem{
    fun readDir(path:String):List<String>

    fun readFile(path:String):String
}

class Fat32FileSystem:FileSystem {
    override fun readDir(path: String): List<String> {
        return emptyList()
    }

    override fun readFile(path: String): String {
        val fileData:String = """
            
            Hello There,
            
            This is the file data here.
            
            Thanks.
        """.trimIndent()


        return fileData
    }

}

class ExtFileSysytem:FileSystem{
    override fun readDir(path: String): List<String> {
       return emptyList()
    }

    override fun readFile(path: String): String {

        return """
            Hey ska ojaoueou iahxkznm
            akjnskas
            
        """.trimIndent()
    }

}


class MemoryFileSystem(var files:List<String>,var fileContents :String):FileSystem{
    override fun readDir(path: String): List<String> {
        return emptyList()
    }

    override fun readFile(path: String): String {
        return """
            Hey ska ojaoueou iahxkznm
            akjnskas
            
        """.trimIndent()
    }

}