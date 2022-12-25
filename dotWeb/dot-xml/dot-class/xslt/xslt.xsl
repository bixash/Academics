<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl ="http://www.w3.org/1999/XSL/Transform" version="2.0">

    <xsl:template match ="/">
    <html>
        <body>
            <h2>Books:</h2>
            <table border ='1'>
                <tr bgcolor ="#cd8932">
                    <th>Book Id</th>
                    <th>Book Name</th>
                    <th>Author Name</th>
                    <th>Publisher</th>
                    <th>Price</th>
                    <th>Edition</th>
                </tr>
            

            <xsl:for-each select="store/book">
                <tr bgcolor ='#f2f2f2'>
                    <td><xsl:value-of select="@id"></xsl:value-of></td>
                    <td><xsl:value-of select="bookname"></xsl:value-of></td>
                    <td><xsl:value-of select="authorname"></xsl:value-of></td>
                    <td><xsl:value-of select="publisher"></xsl:value-of></td>
                    <td><xsl:value-of select="price"></xsl:value-of></td>
                    <td><xsl:value-of select="edition"></xsl:value-of></td>
                </tr>
            </xsl:for-each>
        </table>
        </body>
    </html>
    </xsl:template>
</xsl:stylesheet>