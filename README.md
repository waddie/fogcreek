# fogcreek

Solver for Fog Creek Software Developer question:

> Find a 9 letter string of characters that contains only letters from
>
>     acdegilmnoprstuw
>
> such that the hash(the_string) is
>
>     945924806726376
>
> if hash is defined by the following pseudo-code:
>
>
>     Int64 hash (String s) {
>         Int64 h = 7
>         String letters = "acdegilmnoprstuw"
>         for(Int32 i = 0; i < s.length; i++) {
>             h = (h * 37 + letters.indexOf(s[i]))
>         }
>         return h
>     }
>
> For example, if we were trying to find the 7 letter string where
> hash(the_string) was 680131659347, the answer would be "leepadg".
>
> To apply, please email jobs@fogcreek.com with your solution as the first word
> in the subject line. Include any code you used to solve the problem as an
> attachment, and also send us a current resume in HTML, Plain Text, or PDF
> format. In the body of the email please explain why you would be a good fit
> for this job. If you have a website, send us the URL!

## Installation

Download from https://github.com/waddie/fogcreek

    $ lein uberjar

## Usage

    $ java -jar target/uberjar/fogcreek-1.0.0-standalone.jar

## License

Copyright © 2015 Tom Waddington
