(ns anabra.imdb-quest.test-data)

(def top-10-std-movies-with-awards
 [{:rank 1
   :title "The Shawshank Redemption"
   :id "tt0111161"
   :imdb-rating-count 2635178
   :imdb-rating 9.2
   :num-oscar-wins 0}
  {:rank 2
   :title "The Godfather"
   :id "tt0068646"
   :imdb-rating-count 1826349
   :imdb-rating 9.2
   :num-oscar-wins 3}
  {:rank 3
   :title "The Dark Knight"
   :id "tt0468569"
   :imdb-rating-count 2606377
   :imdb-rating 9.0
   :num-oscar-wins 2}
  {:rank 4
   :title "The Godfather Part II"
   :id "tt0071562"
   :imdb-rating-count 1252614
   :imdb-rating 9.0
   :num-oscar-wins 6}
  {:rank 5
   :title "12 Angry Men"
   :id "tt0050083"
   :imdb-rating-count 778119
   :imdb-rating 8.9
   :num-oscar-wins 0}
  {:rank 6
   :title "Schindler's List"
   :id "tt0108052"
   :imdb-rating-count 1336703
   :imdb-rating 8.9
   :num-oscar-wins 7}
  {:rank 7
   :title "The Lord of the Rings: The Return of the King"
   :id "tt0167260"
   :imdb-rating-count 1808683
   :imdb-rating 8.9
   :num-oscar-wins 11}
  {:rank 8
   :title "Pulp Fiction"
   :id "tt0110912"
   :imdb-rating-count 2016884
   :imdb-rating 8.8
   :num-oscar-wins 1}
  {:rank 9
   :title "The Lord of the Rings: The Fellowship of the Ring"
   :id "tt0120737"
   :imdb-rating-count 1831071
   :imdb-rating 8.8
   :num-oscar-wins 4}
  {:rank 10
   :title "The Good the Bad and the Ugly"
   :id "tt0060196"
   :imdb-rating-count 753017
   :imdb-rating 8.8
   :num-oscar-wins 0}])

(def godfather-awards
  {:description "Showing all 31 wins and 30 nominations"
   :errorMessage nil
   :type "Movie"
   :title "The Godfather"
   :year "1972"
   :imDbId "tt0068646"
   :items
   [{:eventTitle "Academy Awards USA"
     :eventYear "1973"
     :outcomeItems
     [{:outcomeTitle "Winner"
       :outcomeCategory "Oscar"
       :outcomeDetails
       [{:plainText "Best Picture Albert S. Ruddy"
         :html
         "<p>Best Picture <b data-id=\"nm0748665\">Albert S. Ruddy</b></p>"}
        {:plainText
         "Best Actor in a Leading Role Marlon Brando Brando did not attend the ceremony choosing instead to have himself represented by Sacheen ... More Brando did not attend the ceremony choosing instead to have himself represented by Sacheen Littlefeather (a.k.a. Maria Cruz) a Native American Californian actress. She clarified that Brando respectfully refused the award due to the poor treatment of American Indians in entertainment as well as the recent Wounded Knee Incident. After several jeers were drowned out by applause Littlefeather further stated that she hoped she had not intruded and that \"our hearts and understandings will meet with love and generosity\"."
         :html
         "<p>Best Actor in a Leading Role <b data-id=\"nm0000008\">Marlon Brando</b> <span> <p class=\"truncated-note\"> Brando did not attend the ceremony choosing instead to have himself represented by <b data-id=\"nm0514693\">Sacheen </b>... <b data-id=\"javascript: void(0);\">More</b> </p> <p class=\"full-note\"> Brando did not attend the ceremony choosing instead to have himself represented by <b data-id=\"nm0514693\">Sacheen Littlefeather</b> (a.k.a. Maria Cruz) a Native American Californian actress. She clarified that Brando respectfully refused the award due to the poor treatment of American Indians in entertainment as well as the recent Wounded Knee Incident. After several jeers were drowned out by applause Littlefeather further stated that she hoped she had not intruded and that \"our hearts and understandings will meet with love and generosity\". </p> </span></p>"}
        {:plainText
         "Best Writing Screenplay Based on Material from Another Medium Mario Puzo Francis Ford Coppola Mario Puzo was not present at the awards ceremony. His daughter Dorothy Ann Puzo accepted the award... More Mario Puzo was not present at the awards ceremony. His daughter Dorothy Ann Puzo accepted the award on his behalf."
         :html
         "<p>Best Writing Screenplay Based on Material from Another Medium <b data-id=\"nm0701374\">Mario Puzo</b> <b data-id=\"nm0000338\">Francis Ford Coppola</b> <span> <p class=\"truncated-note\"> Mario Puzo was not present at the awards ceremony. His daughter <b data-id=\"nm0701373\">Dorothy Ann Puzo</b> accepted the award... <b data-id=\"javascript: void(0);\">More</b> </p> <p class=\"full-note\"> Mario Puzo was not present at the awards ceremony. His daughter <b data-id=\"nm0701373\">Dorothy Ann Puzo</b> accepted the award on his behalf. </p> </span></p>"}]}
      {:outcomeTitle "Nominee"
       :outcomeCategory "Oscar"
       :outcomeDetails
       [{:plainText "Best Actor in a Supporting Role James Caan"
         :html
         "<p>Best Actor in a Supporting Role <b data-id=\"nm0001001\">James Caan</b></p>"}
        {:plainText "Best Actor in a Supporting Role Robert Duvall"
         :html
         "<p>Best Actor in a Supporting Role <b data-id=\"nm0000380\">Robert Duvall</b></p>"}
        {:plainText
         "Best Actor in a Supporting Role Al Pacino Pacino did not attend the ceremony in protest of perceived category fraud. As his performance ... More Pacino did not attend the ceremony in protest of perceived category fraud. As his performance reflected greater screen time than that of his co-star Marlon Brando Pacino believed he should have received a nomination for Best Actor in a Leading Role."
         :html
         "<p>Best Actor in a Supporting Role <b data-id=\"nm0000199\">Al Pacino</b> <span> <p class=\"truncated-note\"> Pacino did not attend the ceremony in protest of perceived category fraud. As his performance ... <b data-id=\"javascript: void(0);\">More</b> </p> <p class=\"full-note\"> Pacino did not attend the ceremony in protest of perceived category fraud. As his performance reflected greater screen time than that of his co-star <b data-id=\"nm0000008\">Marlon Brando</b> Pacino believed he should have received a nomination for Best Actor in a Leading Role. </p> </span></p>"}
        {:plainText "Best Director Francis Ford Coppola"
         :html
         "<p>Best Director <b data-id=\"nm0000338\">Francis Ford Coppola</b></p>"}
        {:plainText "Best Costume Design Anna Hill Johnstone"
         :html
         "<p>Best Costume Design <b data-id=\"nm0426895\">Anna Hill Johnstone</b></p>"}
        {:plainText
         "Best Sound Charles Grenzbach Richard Portman Christopher Newman"
         :html
         "<p>Best Sound <b data-id=\"nm0340311\">Charles Grenzbach</b> <b data-id=\"nm0692446\">Richard Portman</b> <b data-id=\"nm0628039\">Christopher Newman</b></p>"}
        {:plainText "Best Film Editing William Reynolds Peter Zinner"
         :html
         "<p>Best Film Editing <b data-id=\"nm0722000\">William Reynolds</b> <b data-id=\"nm0957038\">Peter Zinner</b></p>"}
        {:plainText
         "Best Music Original Dramatic Score Nino Rota Withdrawn ineligible: reused Fortunella score; replaced by a nomination for \"Sleuth\""
         :html
         "<p>Best Music Original Dramatic Score <b data-id=\"nm0000065\">Nino Rota</b> <span> Withdrawn ineligible: reused Fortunella score; replaced by a nomination for \"Sleuth\" </span></p>"}]}]}
    {:eventTitle "BAFTA Awards"
     :eventYear "1973"
     :outcomeItems
     [{:outcomeTitle "Winner"
       :outcomeCategory "Anthony Asquith Award for Film Music"
       :outcomeDetails
       [{:plainText "Nino Rota"
         :html "<p><b data-id=\"nm0000065\">Nino Rota</b></p>"}]}
      {:outcomeTitle "Nominee"
       :outcomeCategory "BAFTA Film Award"
       :outcomeDetails
       [{:plainText "Best Costume Design Anna Hill Johnstone"
         :html
         "<p>Best Costume Design <b data-id=\"nm0426895\">Anna Hill Johnstone</b></p>"}
        {:plainText "Most Promising Newcomer to Leading Film Roles Al Pacino"
         :html
         "<p>Most Promising Newcomer to Leading Film Roles <b data-id=\"nm0000199\">Al Pacino</b></p>"}
        {:plainText "Best Supporting Actor Robert Duvall"
         :html
         "<p>Best Supporting Actor <b data-id=\"nm0000380\">Robert Duvall</b></p>"}
        {:plainText "Best Actor Marlon Brando For The Nightcomers"
         :html
         "<p>Best Actor <b data-id=\"nm0000008\">Marlon Brando</b> For <b data-id=\"tt0069007\">The Nightcomers</b></p>"}]}]}
    {:eventTitle "Academy of Science Fiction Fantasy & Horror Films USA"
     :eventYear "2009"
     :outcomeItems
     [{:outcomeTitle "Winner"
       :outcomeCategory "Saturn Award"
       :outcomeDetails
       [{:plainText
         "Best DVD Collection For The Godfather Part II and The Godfather Part III As part of \"The Godfather: The Coppola Restoration\"."
         :html
         "<p>Best DVD Collection For <b data-id=\"tt0071562\">The Godfather Part II</b> and <b data-id=\"tt0099674\">The Godfather Part III</b> <span> As part of \"The Godfather: The Coppola Restoration\". </span></p>"}]}]}
    {:eventTitle "American Cinema Editors USA"
     :eventYear "1973"
     :outcomeItems
     [{:outcomeTitle "Nominee"
       :outcomeCategory "Eddie"
       :outcomeDetails
       [{:plainText "Best Edited Feature Film Peter Zinner"
         :html
         "<p>Best Edited Feature Film <b data-id=\"nm0957038\">Peter Zinner</b></p>"}]}]}
    {:eventTitle "David di Donatello Awards"
     :eventYear "1973"
     :outcomeItems
     [{:outcomeTitle "Winner"
       :outcomeCategory "David"
       :outcomeDetails
       [{:plainText
         "Best Foreign Film (Miglior Film Straniero) Albert S. Ruddy (producer)"
         :html
         "<p>Best Foreign Film (Miglior Film Straniero) <b data-id=\"nm0748665\">Albert S. Ruddy</b> <small>(producer)</small></p>"}]}
      {:outcomeTitle "Winner"
       :outcomeCategory "Special David"
       :outcomeDetails
       [{:plainText "Al Pacino For his acting."
         :html
         "<p><b data-id=\"nm0000199\">Al Pacino</b> <span> For his acting. </span></p>"}]}]}
    {:eventTitle "Directors Guild of America USA"
     :eventYear "1973"
     :outcomeItems
     [{:outcomeTitle "Winner"
       :outcomeCategory "DGA Award"
       :outcomeDetails
       [{:plainText
         "Outstanding Directorial Achievement in Motion Pictures Francis Ford Coppola Fred C. Caruso (unit production manager) (plaque) Fred T. Gallo (assistant director) (plaque) Steven P. Skloot (assistant director) (plaque)"
         :html
         "<p>Outstanding Directorial Achievement in Motion Pictures <b data-id=\"nm0000338\">Francis Ford Coppola</b> <b data-id=\"nm0142301\">Fred C. Caruso</b> <small>(unit production manager) (plaque)</small> <b data-id=\"nm0303031\">Fred T. Gallo</b> <small>(assistant director) (plaque)</small> <b data-id=\"nm0804490\">Steven P. Skloot</b> <small>(assistant director) (plaque)</small></p>"}]}]}
    {:eventTitle "DVD Exclusive Awards"
     :eventYear "2001"
     :outcomeItems
     [{:outcomeTitle "Nominee"
       :outcomeCategory "Video Premiere Award"
       :outcomeDetails
       [{:plainText "Best Audio Commentary Francis Ford Coppola (Paramount)"
         :html
         "<p>Best Audio Commentary <b data-id=\"nm0000338\">Francis Ford Coppola</b> <span> (Paramount) </span></p>"}]}]}
    {:eventTitle "Faro Island Film Festival"
     :eventYear "1972"
     :outcomeItems
     [{:outcomeTitle "Winner"
       :outcomeCategory "Audience Award"
       :outcomeDetails
       [{:plainText "Best Actor Al Pacino"
         :html "<p>Best Actor <b data-id=\"nm0000199\">Al Pacino</b></p>"}]}
      {:outcomeTitle "Winner"
       :outcomeCategory "Golden Train Award"
       :outcomeDetails
       [{:plainText "Best Actor James Caan Al Pacino Marlon Brando"
         :html
         "<p>Best Actor <b data-id=\"nm0001001\">James Caan</b> <b data-id=\"nm0000199\">Al Pacino</b> <b data-id=\"nm0000008\">Marlon Brando</b></p>"}]}
      {:outcomeTitle "Nominee"
       :outcomeCategory "Audience Award"
       :outcomeDetails
       [{:plainText "Best Film Francis Ford Coppola"
         :html
         "<p>Best Film <b data-id=\"nm0000338\">Francis Ford Coppola</b></p>"}]}
      {:outcomeTitle "Nominee"
       :outcomeCategory "Golden Train Award"
       :outcomeDetails
       [{:plainText "Best Film Francis Ford Coppola"
         :html
         "<p>Best Film <b data-id=\"nm0000338\">Francis Ford Coppola</b></p>"}]}]}
    {:eventTitle "Golden Globes USA"
     :eventYear "1973"
     :outcomeItems
     [{:outcomeTitle "Winner"
       :outcomeCategory "Golden Globe"
       :outcomeDetails
       [{:plainText "Best Motion Picture - Drama"
         :html "<p>Best Motion Picture - Drama</p>"}
        {:plainText
         "Best Actor in a Motion Picture - Drama Marlon Brando Brando refused the award in protest of U.S. \"imperialism and racism\"."
         :html
         "<p>Best Actor in a Motion Picture - Drama <b data-id=\"nm0000008\">Marlon Brando</b> <span> Brando refused the award in protest of U.S. \"imperialism and racism\". </span></p>"}
        {:plainText "Best Director - Motion Picture Francis Ford Coppola"
         :html
         "<p>Best Director - Motion Picture <b data-id=\"nm0000338\">Francis Ford Coppola</b></p>"}
        {:plainText
         "Best Screenplay - Motion Picture Francis Ford Coppola Mario Puzo"
         :html
         "<p>Best Screenplay - Motion Picture <b data-id=\"nm0000338\">Francis Ford Coppola</b> <b data-id=\"nm0701374\">Mario Puzo</b></p>"}
        {:plainText "Best Original Score - Motion Picture Nino Rota"
         :html
         "<p>Best Original Score - Motion Picture <b data-id=\"nm0000065\">Nino Rota</b></p>"}]}
      {:outcomeTitle "Nominee"
       :outcomeCategory "Golden Globe"
       :outcomeDetails
       [{:plainText "Best Actor in a Motion Picture - Drama Al Pacino"
         :html
         "<p>Best Actor in a Motion Picture - Drama <b data-id=\"nm0000199\">Al Pacino</b></p>"}
        {:plainText "Best Supporting Actor - Motion Picture James Caan"
         :html
         "<p>Best Supporting Actor - Motion Picture <b data-id=\"nm0001001\">James Caan</b></p>"}]}]}
    {:eventTitle "Golden Schmoes Awards"
     :eventYear "2001"
     :outcomeItems
     [{:outcomeTitle "Winner"
       :outcomeCategory "Golden Schmoes"
       :outcomeDetails
       [{:plainText
         "Best DVD of the Year For The Godfather Part II and The Godfather Part III 'The Godfather Trilogy'"
         :html
         "<p>Best DVD of the Year For <b data-id=\"tt0071562\">The Godfather Part II</b> and <b data-id=\"tt0099674\">The Godfather Part III</b> <span> 'The Godfather Trilogy' </span></p>"}]}]}
    {:eventTitle "Golden Screen Germany"
     :eventYear "1973"
     :outcomeItems
     [{:outcomeTitle "Winner"
       :outcomeCategory "Golden Screen"
       :outcomeDetails [{:plainText "" :html "<p></p>"}]}]}
    {:eventTitle "Grammy Awards"
     :eventYear "1973"
     :outcomeItems
     [{:outcomeTitle "Winner"
       :outcomeCategory "Grammy"
       :outcomeDetails
       [{:plainText
         "Best Original Score Written for a Motion Picture or a Television Special Nino Rota (artist/composer)"
         :html
         "<p>Best Original Score Written for a Motion Picture or a Television Special <b data-id=\"nm0000065\">Nino Rota</b> <small>(artist/composer)</small></p>"}]}
      {:outcomeTitle "Nominee"
       :outcomeCategory "Grammy"
       :outcomeDetails
       [{:plainText
         "Best Instrumental Composition Nino Rota For \"Theme from The Godfather\""
         :html
         "<p>Best Instrumental Composition <b data-id=\"nm0000065\">Nino Rota</b> <span> For \"Theme from The Godfather\" </span></p>"}]}]}
    {:eventTitle "Kansas City Film Critics Circle Awards"
     :eventYear "1972"
     :outcomeItems
     [{:outcomeTitle "Winner"
       :outcomeCategory "KCFCC Award"
       :outcomeDetails
       [{:plainText
         "Best Actor Marlon Brando Tied with Stacy Keach for Fat City (1972)."
         :html
         "<p>Best Actor <b data-id=\"nm0000008\">Marlon Brando</b> <span> Tied with <b data-id=\"nm0005078\">Stacy Keach</b> for <b data-id=\"tt0068575\">Fat City</b> (1972). </span></p>"}
        {:plainText "Best Director Francis Ford Coppola"
         :html
         "<p>Best Director <b data-id=\"nm0000338\">Francis Ford Coppola</b></p>"}]}]}
    {:eventTitle "Las Vegas Film Critics Society Awards"
     :eventYear "2002"
     :outcomeItems
     [{:outcomeTitle "Winner"
       :outcomeCategory "Sierra Award"
       :outcomeDetails [{:plainText "Best DVD" :html "<p>Best DVD</p>"}]}]}
    {:eventTitle "National Board of Review USA"
     :eventYear "1972"
     :outcomeItems
     [{:outcomeTitle "Winner"
       :outcomeCategory "NBR Award"
       :outcomeDetails
       [{:plainText
         "Best Supporting Actor Al Pacino Tied with Joel Grey for Cabaret (1972)."
         :html
         "<p>Best Supporting Actor <b data-id=\"nm0000199\">Al Pacino</b> <span> Tied with <b data-id=\"nm0001297\">Joel Grey</b> for <b data-id=\"tt0068327\">Cabaret</b> (1972). </span></p>"}
        {:plainText "Top Ten Films" :html "<p>Top Ten Films</p>"}]}]}
    {:eventTitle "National Film Preservation Board USA"
     :eventYear "1990"
     :outcomeItems
     [{:outcomeTitle "Winner"
       :outcomeCategory "National Film Registry"
       :outcomeDetails [{:plainText "" :html "<p></p>"}]}]}
    {:eventTitle "National Society of Film Critics Awards USA"
     :eventYear "1972"
     :outcomeItems
     [{:outcomeTitle "Winner"
       :outcomeCategory "NSFC Award"
       :outcomeDetails
       [{:plainText "Best Actor Al Pacino"
         :html "<p>Best Actor <b data-id=\"nm0000199\">Al Pacino</b></p>"}]}
      {:outcomeTitle "Nominee"
       :outcomeCategory "NSFC Award"
       :outcomeDetails
       [{:plainText "Best Film 2nd place"
         :html "<p>Best Film <span> 2nd place </span></p>"}
        {:plainText "Best Director Francis Ford Coppola 3rd place"
         :html
         "<p>Best Director <b data-id=\"nm0000338\">Francis Ford Coppola</b> <span> 3rd place </span></p>"}
        {:plainText "Best Actor Marlon Brando 2nd place"
         :html
         "<p>Best Actor <b data-id=\"nm0000008\">Marlon Brando</b> <span> 2nd place </span></p>"}
        {:plainText "Best Supporting Actor Robert Duvall 3rd place"
         :html
         "<p>Best Supporting Actor <b data-id=\"nm0000380\">Robert Duvall</b> <span> 3rd place </span></p>"}
        {:plainText
         "Best Screenplay Francis Ford Coppola Mario Puzo Tied with Jan Troell and Bengt Forslund for The Emigrants (1971) in 4th place."
         :html
         "<p>Best Screenplay <b data-id=\"nm0000338\">Francis Ford Coppola</b> <b data-id=\"nm0701374\">Mario Puzo</b> <span> Tied with <b data-id=\"nm0873296\">Jan Troell</b> and <b data-id=\"nm0286873\">Bengt Forslund</b> for <b data-id=\"tt0067919\">The Emigrants</b> (1971) in 4th place. </span></p>"}
        {:plainText "Best Cinematography Gordon Willis 3rd place"
         :html
         "<p>Best Cinematography <b data-id=\"nm0932336\">Gordon Willis</b> <span> 3rd place </span></p>"}]}]}
    {:eventTitle "New York Film Critics Circle Awards"
     :eventYear "1973"
     :outcomeItems
     [{:outcomeTitle "Winner"
       :outcomeCategory "NYFCC Award"
       :outcomeDetails
       [{:plainText "Best Supporting Actor Robert Duvall"
         :html
         "<p>Best Supporting Actor <b data-id=\"nm0000380\">Robert Duvall</b></p>"}]}
      {:outcomeTitle "Nominee"
       :outcomeCategory "NYFCC Award"
       :outcomeDetails
       [{:plainText "Best Film" :html "<p>Best Film</p>"}
        {:plainText "Best Director Francis Ford Coppola"
         :html
         "<p>Best Director <b data-id=\"nm0000338\">Francis Ford Coppola</b></p>"}
        {:plainText "Best Actor Marlon Brando"
         :html
         "<p>Best Actor <b data-id=\"nm0000008\">Marlon Brando</b></p>"}]}]}
    {:eventTitle "Online Film & Television Association"
     :eventYear "2021"
     :outcomeItems
     [{:outcomeTitle "Winner"
       :outcomeCategory "OFTA Film Hall of Fame"
       :outcomeDetails
       [{:plainText "Score" :html "<p>Score</p>"}
        {:plainText
         "Character Marlon Brando As Vito Corleone. Award was given posthumously."
         :html
         "<p>Character <b data-id=\"nm0000008\">Marlon Brando</b> <span> As Vito Corleone. Award was given posthumously. </span></p>"}]}]}
    {:eventTitle "Online Film & Television Association"
     :eventYear "1997"
     :outcomeItems
     [{:outcomeTitle "Winner"
       :outcomeCategory "OFTA Film Hall of Fame"
       :outcomeDetails
       [{:plainText "Motion Picture" :html "<p>Motion Picture</p>"}]}]}
    {:eventTitle "Online Film Critics Society Awards"
     :eventYear "2002"
     :outcomeItems
     [{:outcomeTitle "Nominee"
       :outcomeCategory "OFCS Award"
       :outcomeDetails
       [{:plainText
         "Best Overall DVD For The Godfather Part II and The Godfather Part III \"The Godfather Collection\""
         :html
         "<p>Best Overall DVD For <b data-id=\"tt0071562\">The Godfather Part II</b> and <b data-id=\"tt0099674\">The Godfather Part III</b> <span> \"The Godfather Collection\" </span></p>"}]}]}
    {:eventTitle "Satellite Awards"
     :eventYear "2008"
     :outcomeItems
     [{:outcomeTitle "Winner"
       :outcomeCategory "Satellite Award"
       :outcomeDetails
       [{:plainText
         "Best Classic DVD For The Godfather Part II and The Godfather Part III The Godfather Collection - The Coppola Restoration"
         :html
         "<p>Best Classic DVD For <b data-id=\"tt0071562\">The Godfather Part II</b> and <b data-id=\"tt0099674\">The Godfather Part III</b> <span> The Godfather Collection - The Coppola Restoration </span></p>"}]}
      {:outcomeTitle "Nominee"
       :outcomeCategory "Satellite Award"
       :outcomeDetails
       [{:plainText
         "Best Overall Blu-Ray Disc For The Godfather Part II and The Godfather Part III The Godfather Collection - The Coppola Restoration"
         :html
         "<p>Best Overall Blu-Ray Disc For <b data-id=\"tt0071562\">The Godfather Part II</b> and <b data-id=\"tt0099674\">The Godfather Part III</b> <span> The Godfather Collection - The Coppola Restoration </span></p>"}]}]}
    {:eventTitle "Writers Guild of America USA"
     :eventYear "1973"
     :outcomeItems
     [{:outcomeTitle "Winner"
       :outcomeCategory "WGA Award (Screen)"
       :outcomeDetails
       [{:plainText
         "Best Drama Adapted from Another Medium Mario Puzo Francis Ford Coppola"
         :html
         "<p>Best Drama Adapted from Another Medium <b data-id=\"nm0701374\">Mario Puzo</b> <b data-id=\"nm0000338\">Francis Ford Coppola</b></p>"}]}]}]
   :fullTitle "The Godfather (1972)"
   :awardsHtml "deleted this"})

(def shawshank-awards
  {:description "Showing all 21 wins and 43 nominations"
   :errorMessage nil
   :type "Movie"
   :title "The Shawshank Redemption"
   :year "1994"
   :imDbId "tt0111161"
   :items
   [{:eventTitle "Academy Awards USA"
     :eventYear "1995"
     :outcomeItems
     [{:outcomeTitle "Nominee"
       :outcomeCategory "Oscar"
       :outcomeDetails
       [{:plainText "Best Picture Niki Marvin"
         :html "<p>Best Picture <b data-id=\"nm0555550\">Niki Marvin</b></p>"}
        {:plainText "Best Actor in a Leading Role Morgan Freeman"
         :html
         "<p>Best Actor in a Leading Role <b data-id=\"nm0000151\">Morgan Freeman</b></p>"}
        {:plainText
         "Best Writing Screenplay Based on Material Previously Produced or Published Frank Darabont"
         :html
         "<p>Best Writing Screenplay Based on Material Previously Produced or Published <b data-id=\"nm0001104\">Frank Darabont</b></p>"}
        {:plainText "Best Cinematography Roger Deakins"
         :html
         "<p>Best Cinematography <b data-id=\"nm0005683\">Roger Deakins</b></p>"}
        {:plainText
         "Best Sound Robert J. Litt Elliot Tyson Michael Herbick Willie D. Burton"
         :html
         "<p>Best Sound <b data-id=\"nm0514448\">Robert J. Litt</b> <b data-id=\"nm0006525\">Elliot Tyson</b> <b data-id=\"nm0378655\">Michael Herbick</b> <b data-id=\"nm0123770\">Willie D. Burton</b></p>"}
        {:plainText "Best Film Editing Richard Francis-Bruce"
         :html
         "<p>Best Film Editing <b data-id=\"nm0290358\">Richard Francis-Bruce</b></p>"}
        {:plainText "Best Music Original Score Thomas Newman"
         :html
         "<p>Best Music Original Score <b data-id=\"nm0002353\">Thomas Newman</b></p>"}]}]}
    {:eventTitle "Screen Actors Guild Awards"
     :eventYear "1995"
     :outcomeItems
     [{:outcomeTitle "Nominee"
       :outcomeCategory "Actor"
       :outcomeDetails
       [{:plainText
         "Outstanding Performance by a Male Actor in a Leading Role Morgan Freeman"
         :html
         "<p>Outstanding Performance by a Male Actor in a Leading Role <b data-id=\"nm0000151\">Morgan Freeman</b></p>"}
        {:plainText
         "Outstanding Performance by a Male Actor in a Leading Role Tim Robbins"
         :html
         "<p>Outstanding Performance by a Male Actor in a Leading Role <b data-id=\"nm0000209\">Tim Robbins</b></p>"}]}]}
    {:eventTitle "20/20 Awards"
     :eventYear "2015"
     :outcomeItems
     [{:outcomeTitle "Winner"
       :outcomeCategory "Felix"
       :outcomeDetails
       [{:plainText "Best Adapted Screenplay Frank Darabont"
         :html
         "<p>Best Adapted Screenplay <b data-id=\"nm0001104\">Frank Darabont</b></p>"}
        {:plainText "Best Cinematography Roger Deakins"
         :html
         "<p>Best Cinematography <b data-id=\"nm0005683\">Roger Deakins</b></p>"}]}
      {:outcomeTitle "Nominee"
       :outcomeCategory "Felix"
       :outcomeDetails
       [{:plainText "Best Picture" :html "<p>Best Picture</p>"}
        {:plainText "Best Director Frank Darabont"
         :html
         "<p>Best Director <b data-id=\"nm0001104\">Frank Darabont</b></p>"}
        {:plainText "Best Actor Morgan Freeman"
         :html "<p>Best Actor <b data-id=\"nm0000151\">Morgan Freeman</b></p>"}
        {:plainText "Best Original Score Thomas Newman"
         :html
         "<p>Best Original Score <b data-id=\"nm0002353\">Thomas Newman</b></p>"}
        {:plainText "Best Film Editing Richard Francis-Bruce"
         :html
         "<p>Best Film Editing <b data-id=\"nm0290358\">Richard Francis-Bruce</b></p>"}]}]}
    {:eventTitle "Academy of Science Fiction Fantasy & Horror Films USA"
     :eventYear "2016"
     :outcomeItems
     [{:outcomeTitle "Winner"
       :outcomeCategory "Saturn Award"
       :outcomeDetails
       [{:plainText
         "Best DVD/Blu-Ray Collection For The Green Mile and The Majestic As a part of \"The Frank Darabont Collection\"."
         :html
         "<p>Best DVD/Blu-Ray Collection For <b data-id=\"tt0120689\">The Green Mile</b> and <b data-id=\"tt0268995\">The Majestic</b> <span> As a part of \"The Frank Darabont Collection\". </span></p>"}]}]}
    {:eventTitle "Academy of Science Fiction Fantasy & Horror Films USA"
     :eventYear "1995"
     :outcomeItems
     [{:outcomeTitle "Nominee"
       :outcomeCategory "Saturn Award"
       :outcomeDetails
       [{:plainText "Best Action/Adventure/Thriller Film"
         :html "<p>Best Action/Adventure/Thriller Film</p>"}
        {:plainText "Best Writing Frank Darabont"
         :html
         "<p>Best Writing <b data-id=\"nm0001104\">Frank Darabont</b></p>"}]}]}
    {:eventTitle "American Cinema Editors USA"
     :eventYear "1995"
     :outcomeItems
     [{:outcomeTitle "Nominee"
       :outcomeCategory "Eddie"
       :outcomeDetails
       [{:plainText "Best Edited Feature Film Richard Francis-Bruce"
         :html
         "<p>Best Edited Feature Film <b data-id=\"nm0290358\">Richard Francis-Bruce</b></p>"}]}]}
    {:eventTitle "American Society of Cinematographers USA"
     :eventYear "1995"
     :outcomeItems
     [{:outcomeTitle "Winner"
       :outcomeCategory "ASC Award"
       :outcomeDetails
       [{:plainText
         "Outstanding Achievement in Cinematography in Theatrical Releases Roger Deakins"
         :html
         "<p>Outstanding Achievement in Cinematography in Theatrical Releases <b data-id=\"nm0005683\">Roger Deakins</b></p>"}]}]}
    {:eventTitle "Awards Circuit Community Awards"
     :eventYear "1994"
     :outcomeItems
     [{:outcomeTitle "Winner"
       :outcomeCategory "ACCA"
       :outcomeDetails
       [{:plainText "Best Adapted Screenplay Frank Darabont"
         :html
         "<p>Best Adapted Screenplay <b data-id=\"nm0001104\">Frank Darabont</b></p>"}
        {:plainText "Best Cinematography Roger Deakins"
         :html
         "<p>Best Cinematography <b data-id=\"nm0005683\">Roger Deakins</b></p>"}]}
      {:outcomeTitle "Nominee"
       :outcomeCategory "ACCA"
       :outcomeDetails
       [{:plainText "Best Motion Picture Niki Marvin"
         :html
         "<p>Best Motion Picture <b data-id=\"nm0555550\">Niki Marvin</b></p>"}
        {:plainText "Best Director Frank Darabont"
         :html
         "<p>Best Director <b data-id=\"nm0001104\">Frank Darabont</b></p>"}
        {:plainText "Best Actor in a Leading Role Morgan Freeman"
         :html
         "<p>Best Actor in a Leading Role <b data-id=\"nm0000151\">Morgan Freeman</b></p>"}
        {:plainText "Best Actor in a Leading Role Tim Robbins"
         :html
         "<p>Best Actor in a Leading Role <b data-id=\"nm0000209\">Tim Robbins</b></p>"}
        {:plainText
         "Best Art Direction Terence Marsh Peter Landsdown Smith Tied with Tom Duffield and Okowita for Ed Wood (1994) for second place."
         :html
         "<p>Best Art Direction <b data-id=\"nm0550671\">Terence Marsh</b> <b data-id=\"nm0809593\">Peter Landsdown Smith</b> <span> Tied with <b data-id=\"nm0240468\">Tom Duffield</b> and <b data-id=\"nm0645698\">Okowita</b> for <b data-id=\"tt0109707\">Ed Wood</b> (1994) for second place. </span></p>"}
        {:plainText
         "Best Costume Design Elizabeth McBride Tied with Tim Chappel and Lizzy Gardiner for The Adventures of Priscilla Queen of the Desert (1994)... More Tied with Tim Chappel and Lizzy Gardiner for The Adventures of Priscilla Queen of the Desert (1994) for second place."
         :html
         "<p>Best Costume Design <b data-id=\"nm0564296\">Elizabeth McBride</b> <span> <p class=\"truncated-note\"> Tied with <b data-id=\"nm0152579\">Tim Chappel</b> and <b data-id=\"nm0306773\">Lizzy Gardiner</b> for <b data-id=\"tt0109045\">The Adventures of Priscilla Queen of the Desert</b> (1994)... <b data-id=\"javascript: void(0);\">More</b> </p> <p class=\"full-note\"> Tied with <b data-id=\"nm0152579\">Tim Chappel</b> and <b data-id=\"nm0306773\">Lizzy Gardiner</b> for <b data-id=\"tt0109045\">The Adventures of Priscilla Queen of the Desert</b> (1994) for second place. </p> </span></p>"}
        {:plainText "Best Film Editing Richard Francis-Bruce"
         :html
         "<p>Best Film Editing <b data-id=\"nm0290358\">Richard Francis-Bruce</b></p>"}
        {:plainText "Best Achievement in Sound"
         :html "<p>Best Achievement in Sound</p>"}
        {:plainText "Best Original Score Thomas Newman"
         :html
         "<p>Best Original Score <b data-id=\"nm0002353\">Thomas Newman</b></p>"}
        {:plainText
         "Best Cast Ensemble Tim Robbins Morgan Freeman Bob Gunton William Sadler Clancy Brown Gil Bellows Mark Rolston James Whitmore"
         :html
         "<p>Best Cast Ensemble <b data-id=\"nm0000209\">Tim Robbins</b> <b data-id=\"nm0000151\">Morgan Freeman</b> <b data-id=\"nm0348409\">Bob Gunton</b> <b data-id=\"nm0006669\">William Sadler</b> <b data-id=\"nm0000317\">Clancy Brown</b> <b data-id=\"nm0004743\">Gil Bellows</b> <b data-id=\"nm0001679\">Mark Rolston</b> <b data-id=\"nm0926235\">James Whitmore</b></p>"}]}]}
    {:eventTitle "Awards of the Japanese Academy"
     :eventYear "1996"
     :outcomeItems
     [{:outcomeTitle "Winner"
       :outcomeCategory "Award of the Japanese Academy"
       :outcomeDetails
       [{:plainText "Best Foreign Film" :html "<p>Best Foreign Film</p>"}]}]}
    {:eventTitle "Camerimage"
     :eventYear "1995"
     :outcomeItems
     [{:outcomeTitle "Winner"
       :outcomeCategory "Bronze Frog"
       :outcomeDetails
       [{:plainText "Roger Deakins"
         :html "<p><b data-id=\"nm0005683\">Roger Deakins</b></p>"}]}
      {:outcomeTitle "Nominee"
       :outcomeCategory "Golden Frog"
       :outcomeDetails
       [{:plainText "Roger Deakins"
         :html "<p><b data-id=\"nm0005683\">Roger Deakins</b></p>"}]}]}
    {:eventTitle "Casting Society of America USA"
     :eventYear "1995"
     :outcomeItems
     [{:outcomeTitle "Nominee"
       :outcomeCategory "Artios Award"
       :outcomeDetails
       [{:plainText "Best Casting for Feature Film Drama Deborah Aquila"
         :html
         "<p>Best Casting for Feature Film Drama <b data-id=\"nm0032597\">Deborah Aquila</b></p>"}]}]}
    {:eventTitle "Chicago Film Critics Association Awards"
     :eventYear "1995"
     :outcomeItems
     [{:outcomeTitle "Nominee"
       :outcomeCategory "CFCA Award"
       :outcomeDetails
       [{:plainText "Best Supporting Actor Morgan Freeman"
         :html
         "<p>Best Supporting Actor <b data-id=\"nm0000151\">Morgan Freeman</b></p>"}
        {:plainText "Best Picture" :html "<p>Best Picture</p>"}
        {:plainText "Best Screenplay Frank Darabont"
         :html
         "<p>Best Screenplay <b data-id=\"nm0001104\">Frank Darabont</b></p>"}]}]}
    {:eventTitle "Chlotrudis Awards"
     :eventYear "1995"
     :outcomeItems
     [{:outcomeTitle "Winner"
       :outcomeCategory "Chlotrudis Award"
       :outcomeDetails
       [{:plainText
         "Best Actor Morgan Freeman Tied with Wallace Shawn for Vanya on 42nd Street (1994)."
         :html
         "<p>Best Actor <b data-id=\"nm0000151\">Morgan Freeman</b> <span> Tied with <b data-id=\"nm0001728\">Wallace Shawn</b> for <b data-id=\"tt0111590\">Vanya on 42nd Street</b> (1994). </span></p>"}]}
      {:outcomeTitle "Nominee"
       :outcomeCategory "Chlotrudis Award"
       :outcomeDetails
       [{:plainText "Best Actor Tim Robbins"
         :html
         "<p>Best Actor <b data-id=\"nm0000209\">Tim Robbins</b></p>"}]}]}
    {:eventTitle "Dallas-Fort Worth Film Critics Association Awards"
     :eventYear "1995"
     :outcomeItems
     [{:outcomeTitle "Winner"
       :outcomeCategory "DFWFCA Award"
       :outcomeDetails
       [{:plainText
         "Best Cinematography Roger Deakins Tied with John Toll for Legends of the Fall (1994)."
         :html
         "<p>Best Cinematography <b data-id=\"nm0005683\">Roger Deakins</b> <span> Tied with <b data-id=\"nm0001799\">John Toll</b> for <b data-id=\"tt0110322\">Legends of the Fall</b> (1994). </span></p>"}]}
      {:outcomeTitle "Nominee"
       :outcomeCategory "DFWFCA Award"
       :outcomeDetails
       [{:plainText "Best Picture" :html "<p>Best Picture</p>"}
        {:plainText "Best Actor Morgan Freeman"
         :html
         "<p>Best Actor <b data-id=\"nm0000151\">Morgan Freeman</b></p>"}]}]}
    {:eventTitle "Directors Guild of America USA"
     :eventYear "1995"
     :outcomeItems
     [{:outcomeTitle "Nominee"
       :outcomeCategory "DGA Award"
       :outcomeDetails
       [{:plainText
         "Outstanding Directorial Achievement in Motion Pictures Frank Darabont"
         :html
         "<p>Outstanding Directorial Achievement in Motion Pictures <b data-id=\"nm0001104\">Frank Darabont</b></p>"}]}]}
    {:eventTitle "Faro Island Film Festival"
     :eventYear "1994"
     :outcomeItems
     [{:outcomeTitle "Nominee"
       :outcomeCategory "Golden Train Award"
       :outcomeDetails
       [{:plainText "Best Film Frank Darabont"
         :html
         "<p>Best Film <b data-id=\"nm0001104\">Frank Darabont</b></p>"}]}]}
    {:eventTitle "Golden Globes USA"
     :eventYear "1995"
     :outcomeItems
     [{:outcomeTitle "Nominee"
       :outcomeCategory "Golden Globe"
       :outcomeDetails
       [{:plainText
         "Best Performance by an Actor in a Motion Picture - Drama Morgan Freeman"
         :html
         "<p>Best Performance by an Actor in a Motion Picture - Drama <b data-id=\"nm0000151\">Morgan Freeman</b></p>"}
        {:plainText "Best Screenplay - Motion Picture Frank Darabont"
         :html
         "<p>Best Screenplay - Motion Picture <b data-id=\"nm0001104\">Frank Darabont</b></p>"}]}]}
    {:eventTitle "Grammy Awards"
     :eventYear "1995"
     :outcomeItems
     [{:outcomeTitle "Nominee"
       :outcomeCategory "Grammy"
       :outcomeDetails
       [{:plainText
         "Best Instrumental Composition Written for a Motion Picture or for Television Thomas Newman"
         :html
         "<p>Best Instrumental Composition Written for a Motion Picture or for Television <b data-id=\"nm0002353\">Thomas Newman</b></p>"}]}]}
    {:eventTitle "Heartland International Film Festival"
     :eventYear "1995"
     :outcomeItems
     [{:outcomeTitle "Winner"
       :outcomeCategory "Studio Crystal Heart Award"
       :outcomeDetails
       [{:plainText "Frank Darabont"
         :html "<p><b data-id=\"nm0001104\">Frank Darabont</b></p>"}]}]}
    {:eventTitle "Hochi Film Awards"
     :eventYear "1995"
     :outcomeItems
     [{:outcomeTitle "Winner"
       :outcomeCategory "Hochi Film Award"
       :outcomeDetails
       [{:plainText "Best Foreign Language Film Frank Darabont"
         :html
         "<p>Best Foreign Language Film <b data-id=\"nm0001104\">Frank Darabont</b></p>"}]}]}
    {:eventTitle "Humanitas Prize"
     :eventYear "1995"
     :outcomeItems
     [{:outcomeTitle "Winner"
       :outcomeCategory "Humanitas Prize"
       :outcomeDetails
       [{:plainText "Feature Film Category Frank Darabont"
         :html
         "<p>Feature Film Category <b data-id=\"nm0001104\">Frank Darabont</b></p>"}]}]}
    {:eventTitle "Kinema Junpo Awards"
     :eventYear "1996"
     :outcomeItems
     [{:outcomeTitle "Winner"
       :outcomeCategory "Kinema Junpo Award"
       :outcomeDetails
       [{:plainText "Best Foreign Language Film Frank Darabont"
         :html
         "<p>Best Foreign Language Film <b data-id=\"nm0001104\">Frank Darabont</b></p>"}]}
      {:outcomeTitle "Winner"
       :outcomeCategory "Readers' Choice Award"
       :outcomeDetails
       [{:plainText "Best Foreign Language Film Frank Darabont"
         :html
         "<p>Best Foreign Language Film <b data-id=\"nm0001104\">Frank Darabont</b></p>"}]}]}
    {:eventTitle "Mainichi Film Concours"
     :eventYear "1996"
     :outcomeItems
     [{:outcomeTitle "Winner"
       :outcomeCategory "Mainichi Film Concours"
       :outcomeDetails
       [{:plainText "Best Foreign Language Film Frank Darabont"
         :html
         "<p>Best Foreign Language Film <b data-id=\"nm0001104\">Frank Darabont</b></p>"}]}]}
    {:eventTitle "National Board of Review USA"
     :eventYear "1994"
     :outcomeItems
     [{:outcomeTitle "Winner"
       :outcomeCategory "NBR Award"
       :outcomeDetails
       [{:plainText "Top Ten Films" :html "<p>Top Ten Films</p>"}]}]}
    {:eventTitle "National Film Preservation Board USA"
     :eventYear "2015"
     :outcomeItems
     [{:outcomeTitle "Winner"
       :outcomeCategory "National Film Registry"
       :outcomeDetails
       [{:plainText "National Film Preservation Board"
         :html "<p>National Film Preservation Board</p>"}]}]}
    {:eventTitle "Online Film & Television Association"
     :eventYear "1997"
     :outcomeItems
     [{:outcomeTitle "Winner"
       :outcomeCategory "OFTA Film Hall of Fame"
       :outcomeDetails
       [{:plainText "Motion Picture" :html "<p>Motion Picture</p>"}]}]}
    {:eventTitle "PEN Center USA West Literary Awards"
     :eventYear "1995"
     :outcomeItems
     [{:outcomeTitle "Winner"
       :outcomeCategory "Literary Award"
       :outcomeDetails
       [{:plainText "Screenplay Frank Darabont"
         :html
         "<p>Screenplay <b data-id=\"nm0001104\">Frank Darabont</b></p>"}]}]}
    {:eventTitle "Southeastern Film Critics Association Awards"
     :eventYear "1995"
     :outcomeItems
     [{:outcomeTitle "Nominee"
       :outcomeCategory "SEFCA Award"
       :outcomeDetails
       [{:plainText "Best Picture 7th place"
         :html "<p>Best Picture <span> 7th place </span></p>"}]}]}
    {:eventTitle "Turkish Film Critics Association (SIYAD) Awards"
     :eventYear "1995"
     :outcomeItems
     [{:outcomeTitle "Nominee"
       :outcomeCategory "SIYAD Award"
       :outcomeDetails
       [{:plainText "Best Foreign Film 8th Place"
         :html "<p>Best Foreign Film <span> 8th Place </span></p>"}]}]}
    {:eventTitle "USC Scripter Award"
     :eventYear "1995"
     :outcomeItems
     [{:outcomeTitle "Winner"
       :outcomeCategory "USC Scripter Award"
       :outcomeDetails
       [{:plainText "Stephen King (author) Frank Darabont (screenwriter)"
         :html
         "<p><b data-id=\"nm0000175\">Stephen King</b> <small>(author)</small> <b data-id=\"nm0001104\">Frank Darabont</b> <small>(screenwriter)</small></p>"}]}]}
    {:eventTitle "Writers Guild of America USA"
     :eventYear "1995"
     :outcomeItems
     [{:outcomeTitle "Nominee"
       :outcomeCategory "WGA Award (Screen)"
       :outcomeDetails
       [{:plainText
         "Best Screenplay Based on Material Previously Produced or Published Frank Darabont"
         :html
         "<p>Best Screenplay Based on Material Previously Produced or Published <b data-id=\"nm0001104\">Frank Darabont</b></p>"}]}]}]
   :fullTitle "The Shawshank Redemption (1994)"
   :awardsHtml "deleted this"})
