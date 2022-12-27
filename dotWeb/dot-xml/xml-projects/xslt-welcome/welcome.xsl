<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl ="http://www.w3.org/1999/XSL/Transform" version="2.0">

    <xsl:template match="/">
        <html>
            <body>
                <h2 bgcolor="#f2f2f2">Hello Everyone! Welcome to XML to CSS</h2>
                
                <xsl:for-each select="course/subject">
                    <div bgcolor = "#cd8932">
                        <div>
                            <xsl:value-of select="subname"></xsl:value-of>
                        </div>
                        <div>
                            <xsl:value-of select="one"></xsl:value-of>
                        </div>
                        
                        <div>
                            <xsl:value-of select="two"></xsl:value-of>
                        </div>
                        
                        <div>
                            <xsl:value-of select="three"></xsl:value-of>
                        </div>
                        
                        <div>
                            <xsl:value-of select="four"></xsl:value-of>
                        </div>
                        
                    
                    </div>
                    
                </xsl:for-each>
            </body>
        </html>

    </xsl:template>
</xsl:stylesheet>