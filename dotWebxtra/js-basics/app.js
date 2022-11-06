window.onload = function(event) {

    var incr = [5, 35, 55];
    
    var i = 0;
    if (i == 0) {

        i = 1;
        var width = 1;
        var id = setInterval(frame, 80);

        // var suprise-id = setInterval(suprise, 200);

        

        var html_bar = document.getElementById("sing-progress-bar");
        
        var css_bar = document.getElementById("dance-progress-bar");
        
        var js_bar = document.getElementById("pubg-progress-bar");
       


        document.getElementById("play-btn").onclick = greenColor;
        document.getElementById("retry-btn").onclick = blueColor;
        document.getElementById("cancel-btn").onclick = redColor;
        document.getElementById("reset-btn").onclick = resetColor;
        document.getElementById("suprise-btn").onclick = changeColor;


        var tic = document.getElementsByTagName("td")[0];
        var tic1 = document.getElementsByTagName("td")[1];
        var tic2 = document.getElementsByTagName("td")[2];
        var tic3 = document.getElementsByTagName("td")[3];
        var tic4 = document.getElementsByTagName("td")[4];
        var tic5 = document.getElementsByTagName("td")[5];
        var tic6 = document.getElementsByTagName("td")[6];
        var tic7 = document.getElementsByTagName("td")[7];
        var tic8 = document.getElementsByTagName("td")[8];

        function greenColor() {
            var heading = document.getElementById("my-skill");
            heading.style.color = "green";

            tic.style.backgroundColor = "#00aa06";
            tic1.style.backgroundColor = "#00aa06";
            tic2.style.backgroundColor = "#00aa06";
            tic3.style.backgroundColor = "#00aa06";
            tic4.style.backgroundColor = "#00aa06";
            tic5.style.backgroundColor = "#00aa06";
            tic6.style.backgroundColor = "#00aa06";
            tic7.style.backgroundColor = "#00aa06";
            tic8.style.backgroundColor = "#00aa06";

            return false;
        }
        function blueColor() {
            var heading = document.getElementById("my-skill");
            heading.style.color = "blue";

            tic.style.backgroundColor = "blue";
            tic1.style.backgroundColor = "blue";
            tic2.style.backgroundColor = "blue";
            tic3.style.backgroundColor = "blue";
            tic4.style.backgroundColor = "blue";
            tic5.style.backgroundColor = "blue";
            tic6.style.backgroundColor = "blue";
            tic7.style.backgroundColor = "blue";
            tic8.style.backgroundColor = "blue";
            return false;
        }
        function redColor() {
            var heading = document.getElementById("my-skill");
            heading.style.color = "red";

            tic.style.backgroundColor = "red";
            tic1.style.backgroundColor = "red";
            tic2.style.backgroundColor = "red";
            tic3.style.backgroundColor = "red";
            tic4.style.backgroundColor = "red";
            tic5.style.backgroundColor = "red";
            tic6.style.backgroundColor = "red";
            tic7.style.backgroundColor = "red";
            tic8.style.backgroundColor = "red";
            return false;
        }

        
        
        function grayColor() {
            var heading = document.getElementById("my-skill");
            heading.style.color = "unset";

            tic.style.backgroundColor = "unset";
            tic1.style.backgroundColor = "unset";
            tic2.style.backgroundColor = "unset";
            tic3.style.backgroundColor = "unset";
            tic4.style.backgroundColor = "unset";
            tic5.style.backgroundColor = "unset";
            tic6.style.backgroundColor = "unset";
            tic7.style.backgroundColor = "unset";
            tic8.style.backgroundColor = "unset";
            return false;
        }

        function changeColor () {
           var change = setInterval(supriseColor, 200);
          

        }

        
        function supriseColor() {

            var rnum = Math.ceil(Math.random()* 10);

            var heading = document.getElementById("my-skill");
            const color_name =["white","red","green","blue",
            "maroon","#dbdbd","pink","black","gray","purple",
            "magenta","teal","crimson","orangered","rgb(58, 58, 224)"];


            var index = Math.floor(Math.random()* 10);
            heading.style.color = color_name[index];

            tic.style.backgroundColor = color_name[index+1];
            tic1.style.backgroundColor = color_name[index+2];
            tic2.style.backgroundColor = color_name[index+3];
            tic3.style.backgroundColor = color_name[index+6];
            tic4.style.backgroundColor = color_name[index+4];
            tic5.style.backgroundColor = color_name[index+5];
            tic6.style.backgroundColor = color_name[index+7];
            tic8.style.backgroundColor = color_name[index+8];
            tic7.style.backgroundColor = color_name[index+9];


            return false;


        }


        function frame() {

            
            
            if (width <= incr[0] + 25) {
                
                width++;
                html_bar.style.width = width + "%";
                
            } 
           if (width <= incr[1] + 25) {
                
                width++;
                js_bar.style.width = width + "%";
                
            } 
            if (width <= incr[2] + 25) {
                
                width++;
                css_bar.style.width = width + "%";
                
            }
            
            else {
                clearInterval(id);
                i = 0;
                
            }
            
        }


        
        

        
            
        
    }
}