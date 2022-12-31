<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl ="http://www.w3.org/1999/XSL/Transform" version="2.0">

    <xsl:template match = "/">
        <html>
            <body>
                <h2 style="background-color:green; text-align:center; color:white;">Hello Everyone! Welcome to XML to CSS</h2>
                
                <div style=" background-color:#ffffff">
                    <xsl:for-each select="course/subject">
                    <div style="text-align:center; margin: 0.5em 0px; padding:0.3em; background-color:#f0f0f0;" >
                        <div style="color:green; font-size: 20px; text-decoration: underline">
                            <xsl:value-of select="subname"></xsl:value-of>
                        </div>

                        <div style="color:green;">
                            <xsl:value-of select="one"></xsl:value-of>
                        </div>
                        
                        <div style="color:red;">
                            <xsl:value-of select="two"></xsl:value-of>
                        </div>
                        
                        <div style="color:blue;">
                            <xsl:value-of select="three"></xsl:value-of>
                        </div>
                        
                        <div style="color:gold;">
                            <xsl:value-of select="four"></xsl:value-of>
                        </div>
                        
                    
                    </div>
                    
                </xsl:for-each>

                </div>
                
            </body>
        </html>

    </xsl:template>
</xsl:stylesheet>