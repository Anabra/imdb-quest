(ns anabra.imdb-quest.test-data)

(def godfather-awards
  {:description "Showing all 31 wins and 30 nominations",
   :errorMessage nil,
   :type "Movie",
   :title "The Godfather",
   :year "1972",
   :imDbId "tt0068646",
   :items
   [{:eventTitle "Academy Awards, USA",
     :eventYear "1973",
     :outcomeItems
     [{:outcomeTitle "Winner",
       :outcomeCategory "Oscar",
       :outcomeDetails
       [{:plainText "Best Picture Albert S. Ruddy",
         :html
         "<p>Best Picture <b data-id=\"nm0748665\">Albert S. Ruddy</b></p>"}
        {:plainText
         "Best Actor in a Leading Role Marlon Brando Brando did not attend the ceremony, choosing instead to have himself represented by Sacheen ... More Brando did not attend the ceremony, choosing instead to have himself represented by Sacheen Littlefeather (a.k.a. Maria Cruz), a Native American Californian actress. She clarified that Brando respectfully refused the award due to the poor treatment of American Indians in entertainment, as well as the recent Wounded Knee Incident. After several jeers were drowned out by applause, Littlefeather further stated that she hoped she had not intruded and that \"our hearts and understandings will meet with love and generosity\".",
         :html
         "<p>Best Actor in a Leading Role <b data-id=\"nm0000008\">Marlon Brando</b> <span> <p class=\"truncated-note\"> Brando did not attend the ceremony, choosing instead to have himself represented by <b data-id=\"nm0514693\">Sacheen </b>... <b data-id=\"javascript: void(0);\">More</b> </p> <p class=\"full-note\"> Brando did not attend the ceremony, choosing instead to have himself represented by <b data-id=\"nm0514693\">Sacheen Littlefeather</b> (a.k.a. Maria Cruz), a Native American Californian actress. She clarified that Brando respectfully refused the award due to the poor treatment of American Indians in entertainment, as well as the recent Wounded Knee Incident. After several jeers were drowned out by applause, Littlefeather further stated that she hoped she had not intruded and that \"our hearts and understandings will meet with love and generosity\". </p> </span></p>"}
        {:plainText
         "Best Writing, Screenplay Based on Material from Another Medium Mario Puzo Francis Ford Coppola Mario Puzo was not present at the awards ceremony. His daughter Dorothy Ann Puzo accepted the award... More Mario Puzo was not present at the awards ceremony. His daughter Dorothy Ann Puzo accepted the award on his behalf.",
         :html
         "<p>Best Writing, Screenplay Based on Material from Another Medium <b data-id=\"nm0701374\">Mario Puzo</b> <b data-id=\"nm0000338\">Francis Ford Coppola</b> <span> <p class=\"truncated-note\"> Mario Puzo was not present at the awards ceremony. His daughter <b data-id=\"nm0701373\">Dorothy Ann Puzo</b> accepted the award... <b data-id=\"javascript: void(0);\">More</b> </p> <p class=\"full-note\"> Mario Puzo was not present at the awards ceremony. His daughter <b data-id=\"nm0701373\">Dorothy Ann Puzo</b> accepted the award on his behalf. </p> </span></p>"}]}
      {:outcomeTitle "Nominee",
       :outcomeCategory "Oscar",
       :outcomeDetails
       [{:plainText "Best Actor in a Supporting Role James Caan",
         :html
         "<p>Best Actor in a Supporting Role <b data-id=\"nm0001001\">James Caan</b></p>"}
        {:plainText "Best Actor in a Supporting Role Robert Duvall",
         :html
         "<p>Best Actor in a Supporting Role <b data-id=\"nm0000380\">Robert Duvall</b></p>"}
        {:plainText
         "Best Actor in a Supporting Role Al Pacino Pacino did not attend the ceremony in protest of perceived category fraud. As his performance ... More Pacino did not attend the ceremony in protest of perceived category fraud. As his performance reflected greater screen time than that of his co-star Marlon Brando, Pacino believed he should have received a nomination for Best Actor in a Leading Role.",
         :html
         "<p>Best Actor in a Supporting Role <b data-id=\"nm0000199\">Al Pacino</b> <span> <p class=\"truncated-note\"> Pacino did not attend the ceremony in protest of perceived category fraud. As his performance ... <b data-id=\"javascript: void(0);\">More</b> </p> <p class=\"full-note\"> Pacino did not attend the ceremony in protest of perceived category fraud. As his performance reflected greater screen time than that of his co-star <b data-id=\"nm0000008\">Marlon Brando</b>, Pacino believed he should have received a nomination for Best Actor in a Leading Role. </p> </span></p>"}
        {:plainText "Best Director Francis Ford Coppola",
         :html
         "<p>Best Director <b data-id=\"nm0000338\">Francis Ford Coppola</b></p>"}
        {:plainText "Best Costume Design Anna Hill Johnstone",
         :html
         "<p>Best Costume Design <b data-id=\"nm0426895\">Anna Hill Johnstone</b></p>"}
        {:plainText
         "Best Sound Charles Grenzbach Richard Portman Christopher Newman",
         :html
         "<p>Best Sound <b data-id=\"nm0340311\">Charles Grenzbach</b> <b data-id=\"nm0692446\">Richard Portman</b> <b data-id=\"nm0628039\">Christopher Newman</b></p>"}
        {:plainText "Best Film Editing William Reynolds Peter Zinner",
         :html
         "<p>Best Film Editing <b data-id=\"nm0722000\">William Reynolds</b> <b data-id=\"nm0957038\">Peter Zinner</b></p>"}
        {:plainText
         "Best Music, Original Dramatic Score Nino Rota Withdrawn, ineligible: reused Fortunella score; replaced by a nomination for \"Sleuth\"",
         :html
         "<p>Best Music, Original Dramatic Score <b data-id=\"nm0000065\">Nino Rota</b> <span> Withdrawn, ineligible: reused Fortunella score; replaced by a nomination for \"Sleuth\" </span></p>"}]}]}
    {:eventTitle "BAFTA Awards",
     :eventYear "1973",
     :outcomeItems
     [{:outcomeTitle "Winner",
       :outcomeCategory "Anthony Asquith Award for Film Music",
       :outcomeDetails
       [{:plainText "Nino Rota",
         :html "<p><b data-id=\"nm0000065\">Nino Rota</b></p>"}]}
      {:outcomeTitle "Nominee",
       :outcomeCategory "BAFTA Film Award",
       :outcomeDetails
       [{:plainText "Best Costume Design Anna Hill Johnstone",
         :html
         "<p>Best Costume Design <b data-id=\"nm0426895\">Anna Hill Johnstone</b></p>"}
        {:plainText "Most Promising Newcomer to Leading Film Roles Al Pacino",
         :html
         "<p>Most Promising Newcomer to Leading Film Roles <b data-id=\"nm0000199\">Al Pacino</b></p>"}
        {:plainText "Best Supporting Actor Robert Duvall",
         :html
         "<p>Best Supporting Actor <b data-id=\"nm0000380\">Robert Duvall</b></p>"}
        {:plainText "Best Actor Marlon Brando For The Nightcomers",
         :html
         "<p>Best Actor <b data-id=\"nm0000008\">Marlon Brando</b> For <b data-id=\"tt0069007\">The Nightcomers</b></p>"}]}]}
    {:eventTitle "Academy of Science Fiction, Fantasy & Horror Films, USA",
     :eventYear "2009",
     :outcomeItems
     [{:outcomeTitle "Winner",
       :outcomeCategory "Saturn Award",
       :outcomeDetails
       [{:plainText
         "Best DVD Collection For The Godfather Part II and The Godfather Part III As part of \"The Godfather: The Coppola Restoration\".",
         :html
         "<p>Best DVD Collection For <b data-id=\"tt0071562\">The Godfather Part II</b> and <b data-id=\"tt0099674\">The Godfather Part III</b> <span> As part of \"The Godfather: The Coppola Restoration\". </span></p>"}]}]}
    {:eventTitle "American Cinema Editors, USA",
     :eventYear "1973",
     :outcomeItems
     [{:outcomeTitle "Nominee",
       :outcomeCategory "Eddie",
       :outcomeDetails
       [{:plainText "Best Edited Feature Film Peter Zinner",
         :html
         "<p>Best Edited Feature Film <b data-id=\"nm0957038\">Peter Zinner</b></p>"}]}]}
    {:eventTitle "David di Donatello Awards",
     :eventYear "1973",
     :outcomeItems
     [{:outcomeTitle "Winner",
       :outcomeCategory "David",
       :outcomeDetails
       [{:plainText
         "Best Foreign Film (Miglior Film Straniero) Albert S. Ruddy (producer)",
         :html
         "<p>Best Foreign Film (Miglior Film Straniero) <b data-id=\"nm0748665\">Albert S. Ruddy</b> <small>(producer)</small></p>"}]}
      {:outcomeTitle "Winner",
       :outcomeCategory "Special David",
       :outcomeDetails
       [{:plainText "Al Pacino For his acting.",
         :html
         "<p><b data-id=\"nm0000199\">Al Pacino</b> <span> For his acting. </span></p>"}]}]}
    {:eventTitle "Directors Guild of America, USA",
     :eventYear "1973",
     :outcomeItems
     [{:outcomeTitle "Winner",
       :outcomeCategory "DGA Award",
       :outcomeDetails
       [{:plainText
         "Outstanding Directorial Achievement in Motion Pictures Francis Ford Coppola Fred C. Caruso (unit production manager) (plaque) Fred T. Gallo (assistant director) (plaque) Steven P. Skloot (assistant director) (plaque)",
         :html
         "<p>Outstanding Directorial Achievement in Motion Pictures <b data-id=\"nm0000338\">Francis Ford Coppola</b> <b data-id=\"nm0142301\">Fred C. Caruso</b> <small>(unit production manager) (plaque)</small> <b data-id=\"nm0303031\">Fred T. Gallo</b> <small>(assistant director) (plaque)</small> <b data-id=\"nm0804490\">Steven P. Skloot</b> <small>(assistant director) (plaque)</small></p>"}]}]}
    {:eventTitle "DVD Exclusive Awards",
     :eventYear "2001",
     :outcomeItems
     [{:outcomeTitle "Nominee",
       :outcomeCategory "Video Premiere Award",
       :outcomeDetails
       [{:plainText "Best Audio Commentary Francis Ford Coppola (Paramount)",
         :html
         "<p>Best Audio Commentary <b data-id=\"nm0000338\">Francis Ford Coppola</b> <span> (Paramount) </span></p>"}]}]}
    {:eventTitle "Faro Island Film Festival",
     :eventYear "1972",
     :outcomeItems
     [{:outcomeTitle "Winner",
       :outcomeCategory "Audience Award",
       :outcomeDetails
       [{:plainText "Best Actor Al Pacino",
         :html "<p>Best Actor <b data-id=\"nm0000199\">Al Pacino</b></p>"}]}
      {:outcomeTitle "Winner",
       :outcomeCategory "Golden Train Award",
       :outcomeDetails
       [{:plainText "Best Actor James Caan Al Pacino Marlon Brando",
         :html
         "<p>Best Actor <b data-id=\"nm0001001\">James Caan</b> <b data-id=\"nm0000199\">Al Pacino</b> <b data-id=\"nm0000008\">Marlon Brando</b></p>"}]}
      {:outcomeTitle "Nominee",
       :outcomeCategory "Audience Award",
       :outcomeDetails
       [{:plainText "Best Film Francis Ford Coppola",
         :html
         "<p>Best Film <b data-id=\"nm0000338\">Francis Ford Coppola</b></p>"}]}
      {:outcomeTitle "Nominee",
       :outcomeCategory "Golden Train Award",
       :outcomeDetails
       [{:plainText "Best Film Francis Ford Coppola",
         :html
         "<p>Best Film <b data-id=\"nm0000338\">Francis Ford Coppola</b></p>"}]}]}
    {:eventTitle "Golden Globes, USA",
     :eventYear "1973",
     :outcomeItems
     [{:outcomeTitle "Winner",
       :outcomeCategory "Golden Globe",
       :outcomeDetails
       [{:plainText "Best Motion Picture - Drama",
         :html "<p>Best Motion Picture - Drama</p>"}
        {:plainText
         "Best Actor in a Motion Picture - Drama Marlon Brando Brando refused the award in protest of U.S. \"imperialism and racism\".",
         :html
         "<p>Best Actor in a Motion Picture - Drama <b data-id=\"nm0000008\">Marlon Brando</b> <span> Brando refused the award in protest of U.S. \"imperialism and racism\". </span></p>"}
        {:plainText "Best Director - Motion Picture Francis Ford Coppola",
         :html
         "<p>Best Director - Motion Picture <b data-id=\"nm0000338\">Francis Ford Coppola</b></p>"}
        {:plainText
         "Best Screenplay - Motion Picture Francis Ford Coppola Mario Puzo",
         :html
         "<p>Best Screenplay - Motion Picture <b data-id=\"nm0000338\">Francis Ford Coppola</b> <b data-id=\"nm0701374\">Mario Puzo</b></p>"}
        {:plainText "Best Original Score - Motion Picture Nino Rota",
         :html
         "<p>Best Original Score - Motion Picture <b data-id=\"nm0000065\">Nino Rota</b></p>"}]}
      {:outcomeTitle "Nominee",
       :outcomeCategory "Golden Globe",
       :outcomeDetails
       [{:plainText "Best Actor in a Motion Picture - Drama Al Pacino",
         :html
         "<p>Best Actor in a Motion Picture - Drama <b data-id=\"nm0000199\">Al Pacino</b></p>"}
        {:plainText "Best Supporting Actor - Motion Picture James Caan",
         :html
         "<p>Best Supporting Actor - Motion Picture <b data-id=\"nm0001001\">James Caan</b></p>"}]}]}
    {:eventTitle "Golden Schmoes Awards",
     :eventYear "2001",
     :outcomeItems
     [{:outcomeTitle "Winner",
       :outcomeCategory "Golden Schmoes",
       :outcomeDetails
       [{:plainText
         "Best DVD of the Year For The Godfather Part II and The Godfather Part III 'The Godfather Trilogy'",
         :html
         "<p>Best DVD of the Year For <b data-id=\"tt0071562\">The Godfather Part II</b> and <b data-id=\"tt0099674\">The Godfather Part III</b> <span> 'The Godfather Trilogy' </span></p>"}]}]}
    {:eventTitle "Golden Screen, Germany",
     :eventYear "1973",
     :outcomeItems
     [{:outcomeTitle "Winner",
       :outcomeCategory "Golden Screen",
       :outcomeDetails [{:plainText "", :html "<p></p>"}]}]}
    {:eventTitle "Grammy Awards",
     :eventYear "1973",
     :outcomeItems
     [{:outcomeTitle "Winner",
       :outcomeCategory "Grammy",
       :outcomeDetails
       [{:plainText
         "Best Original Score Written for a Motion Picture or a Television Special Nino Rota (artist/composer)",
         :html
         "<p>Best Original Score Written for a Motion Picture or a Television Special <b data-id=\"nm0000065\">Nino Rota</b> <small>(artist/composer)</small></p>"}]}
      {:outcomeTitle "Nominee",
       :outcomeCategory "Grammy",
       :outcomeDetails
       [{:plainText
         "Best Instrumental Composition Nino Rota For \"Theme from The Godfather\"",
         :html
         "<p>Best Instrumental Composition <b data-id=\"nm0000065\">Nino Rota</b> <span> For \"Theme from The Godfather\" </span></p>"}]}]}
    {:eventTitle "Kansas City Film Critics Circle Awards",
     :eventYear "1972",
     :outcomeItems
     [{:outcomeTitle "Winner",
       :outcomeCategory "KCFCC Award",
       :outcomeDetails
       [{:plainText
         "Best Actor Marlon Brando Tied with Stacy Keach for Fat City (1972).",
         :html
         "<p>Best Actor <b data-id=\"nm0000008\">Marlon Brando</b> <span> Tied with <b data-id=\"nm0005078\">Stacy Keach</b> for <b data-id=\"tt0068575\">Fat City</b> (1972). </span></p>"}
        {:plainText "Best Director Francis Ford Coppola",
         :html
         "<p>Best Director <b data-id=\"nm0000338\">Francis Ford Coppola</b></p>"}]}]}
    {:eventTitle "Las Vegas Film Critics Society Awards",
     :eventYear "2002",
     :outcomeItems
     [{:outcomeTitle "Winner",
       :outcomeCategory "Sierra Award",
       :outcomeDetails [{:plainText "Best DVD", :html "<p>Best DVD</p>"}]}]}
    {:eventTitle "National Board of Review, USA",
     :eventYear "1972",
     :outcomeItems
     [{:outcomeTitle "Winner",
       :outcomeCategory "NBR Award",
       :outcomeDetails
       [{:plainText
         "Best Supporting Actor Al Pacino Tied with Joel Grey for Cabaret (1972).",
         :html
         "<p>Best Supporting Actor <b data-id=\"nm0000199\">Al Pacino</b> <span> Tied with <b data-id=\"nm0001297\">Joel Grey</b> for <b data-id=\"tt0068327\">Cabaret</b> (1972). </span></p>"}
        {:plainText "Top Ten Films", :html "<p>Top Ten Films</p>"}]}]}
    {:eventTitle "National Film Preservation Board, USA",
     :eventYear "1990",
     :outcomeItems
     [{:outcomeTitle "Winner",
       :outcomeCategory "National Film Registry",
       :outcomeDetails [{:plainText "", :html "<p></p>"}]}]}
    {:eventTitle "National Society of Film Critics Awards, USA",
     :eventYear "1972",
     :outcomeItems
     [{:outcomeTitle "Winner",
       :outcomeCategory "NSFC Award",
       :outcomeDetails
       [{:plainText "Best Actor Al Pacino",
         :html "<p>Best Actor <b data-id=\"nm0000199\">Al Pacino</b></p>"}]}
      {:outcomeTitle "Nominee",
       :outcomeCategory "NSFC Award",
       :outcomeDetails
       [{:plainText "Best Film 2nd place",
         :html "<p>Best Film <span> 2nd place </span></p>"}
        {:plainText "Best Director Francis Ford Coppola 3rd place",
         :html
         "<p>Best Director <b data-id=\"nm0000338\">Francis Ford Coppola</b> <span> 3rd place </span></p>"}
        {:plainText "Best Actor Marlon Brando 2nd place",
         :html
         "<p>Best Actor <b data-id=\"nm0000008\">Marlon Brando</b> <span> 2nd place </span></p>"}
        {:plainText "Best Supporting Actor Robert Duvall 3rd place",
         :html
         "<p>Best Supporting Actor <b data-id=\"nm0000380\">Robert Duvall</b> <span> 3rd place </span></p>"}
        {:plainText
         "Best Screenplay Francis Ford Coppola Mario Puzo Tied with Jan Troell and Bengt Forslund for The Emigrants (1971) in 4th place.",
         :html
         "<p>Best Screenplay <b data-id=\"nm0000338\">Francis Ford Coppola</b> <b data-id=\"nm0701374\">Mario Puzo</b> <span> Tied with <b data-id=\"nm0873296\">Jan Troell</b> and <b data-id=\"nm0286873\">Bengt Forslund</b> for <b data-id=\"tt0067919\">The Emigrants</b> (1971) in 4th place. </span></p>"}
        {:plainText "Best Cinematography Gordon Willis 3rd place",
         :html
         "<p>Best Cinematography <b data-id=\"nm0932336\">Gordon Willis</b> <span> 3rd place </span></p>"}]}]}
    {:eventTitle "New York Film Critics Circle Awards",
     :eventYear "1973",
     :outcomeItems
     [{:outcomeTitle "Winner",
       :outcomeCategory "NYFCC Award",
       :outcomeDetails
       [{:plainText "Best Supporting Actor Robert Duvall",
         :html
         "<p>Best Supporting Actor <b data-id=\"nm0000380\">Robert Duvall</b></p>"}]}
      {:outcomeTitle "Nominee",
       :outcomeCategory "NYFCC Award",
       :outcomeDetails
       [{:plainText "Best Film", :html "<p>Best Film</p>"}
        {:plainText "Best Director Francis Ford Coppola",
         :html
         "<p>Best Director <b data-id=\"nm0000338\">Francis Ford Coppola</b></p>"}
        {:plainText "Best Actor Marlon Brando",
         :html
         "<p>Best Actor <b data-id=\"nm0000008\">Marlon Brando</b></p>"}]}]}
    {:eventTitle "Online Film & Television Association",
     :eventYear "2021",
     :outcomeItems
     [{:outcomeTitle "Winner",
       :outcomeCategory "OFTA Film Hall of Fame",
       :outcomeDetails
       [{:plainText "Score", :html "<p>Score</p>"}
        {:plainText
         "Character Marlon Brando As Vito Corleone. Award was given posthumously.",
         :html
         "<p>Character <b data-id=\"nm0000008\">Marlon Brando</b> <span> As Vito Corleone. Award was given posthumously. </span></p>"}]}]}
    {:eventTitle "Online Film & Television Association",
     :eventYear "1997",
     :outcomeItems
     [{:outcomeTitle "Winner",
       :outcomeCategory "OFTA Film Hall of Fame",
       :outcomeDetails
       [{:plainText "Motion Picture", :html "<p>Motion Picture</p>"}]}]}
    {:eventTitle "Online Film Critics Society Awards",
     :eventYear "2002",
     :outcomeItems
     [{:outcomeTitle "Nominee",
       :outcomeCategory "OFCS Award",
       :outcomeDetails
       [{:plainText
         "Best Overall DVD For The Godfather Part II and The Godfather Part III \"The Godfather Collection\"",
         :html
         "<p>Best Overall DVD For <b data-id=\"tt0071562\">The Godfather Part II</b> and <b data-id=\"tt0099674\">The Godfather Part III</b> <span> \"The Godfather Collection\" </span></p>"}]}]}
    {:eventTitle "Satellite Awards",
     :eventYear "2008",
     :outcomeItems
     [{:outcomeTitle "Winner",
       :outcomeCategory "Satellite Award",
       :outcomeDetails
       [{:plainText
         "Best Classic DVD For The Godfather Part II and The Godfather Part III The Godfather Collection - The Coppola Restoration",
         :html
         "<p>Best Classic DVD For <b data-id=\"tt0071562\">The Godfather Part II</b> and <b data-id=\"tt0099674\">The Godfather Part III</b> <span> The Godfather Collection - The Coppola Restoration </span></p>"}]}
      {:outcomeTitle "Nominee",
       :outcomeCategory "Satellite Award",
       :outcomeDetails
       [{:plainText
         "Best Overall Blu-Ray Disc For The Godfather Part II and The Godfather Part III The Godfather Collection - The Coppola Restoration",
         :html
         "<p>Best Overall Blu-Ray Disc For <b data-id=\"tt0071562\">The Godfather Part II</b> and <b data-id=\"tt0099674\">The Godfather Part III</b> <span> The Godfather Collection - The Coppola Restoration </span></p>"}]}]}
    {:eventTitle "Writers Guild of America, USA",
     :eventYear "1973",
     :outcomeItems
     [{:outcomeTitle "Winner",
       :outcomeCategory "WGA Award (Screen)",
       :outcomeDetails
       [{:plainText
         "Best Drama Adapted from Another Medium Mario Puzo Francis Ford Coppola",
         :html
         "<p>Best Drama Adapted from Another Medium <b data-id=\"nm0701374\">Mario Puzo</b> <b data-id=\"nm0000338\">Francis Ford Coppola</b></p>"}]}]}],
   :fullTitle "The Godfather (1972)",
   :awardsHtml "deleted this"})

(def shawshank-awards
  {:description "Showing all 21 wins and 43 nominations",
   :errorMessage nil,
   :type "Movie",
   :title "The Shawshank Redemption",
   :year "1994",
   :imDbId "tt0111161",
   :items
   [{:eventTitle "Academy Awards, USA",
     :eventYear "1995",
     :outcomeItems
     [{:outcomeTitle "Nominee",
       :outcomeCategory "Oscar",
       :outcomeDetails
       [{:plainText "Best Picture Niki Marvin",
         :html "<p>Best Picture <b data-id=\"nm0555550\">Niki Marvin</b></p>"}
        {:plainText "Best Actor in a Leading Role Morgan Freeman",
         :html
         "<p>Best Actor in a Leading Role <b data-id=\"nm0000151\">Morgan Freeman</b></p>"}
        {:plainText
         "Best Writing, Screenplay Based on Material Previously Produced or Published Frank Darabont",
         :html
         "<p>Best Writing, Screenplay Based on Material Previously Produced or Published <b data-id=\"nm0001104\">Frank Darabont</b></p>"}
        {:plainText "Best Cinematography Roger Deakins",
         :html
         "<p>Best Cinematography <b data-id=\"nm0005683\">Roger Deakins</b></p>"}
        {:plainText
         "Best Sound Robert J. Litt Elliot Tyson Michael Herbick Willie D. Burton",
         :html
         "<p>Best Sound <b data-id=\"nm0514448\">Robert J. Litt</b> <b data-id=\"nm0006525\">Elliot Tyson</b> <b data-id=\"nm0378655\">Michael Herbick</b> <b data-id=\"nm0123770\">Willie D. Burton</b></p>"}
        {:plainText "Best Film Editing Richard Francis-Bruce",
         :html
         "<p>Best Film Editing <b data-id=\"nm0290358\">Richard Francis-Bruce</b></p>"}
        {:plainText "Best Music, Original Score Thomas Newman",
         :html
         "<p>Best Music, Original Score <b data-id=\"nm0002353\">Thomas Newman</b></p>"}]}]}
    {:eventTitle "Screen Actors Guild Awards",
     :eventYear "1995",
     :outcomeItems
     [{:outcomeTitle "Nominee",
       :outcomeCategory "Actor",
       :outcomeDetails
       [{:plainText
         "Outstanding Performance by a Male Actor in a Leading Role Morgan Freeman",
         :html
         "<p>Outstanding Performance by a Male Actor in a Leading Role <b data-id=\"nm0000151\">Morgan Freeman</b></p>"}
        {:plainText
         "Outstanding Performance by a Male Actor in a Leading Role Tim Robbins",
         :html
         "<p>Outstanding Performance by a Male Actor in a Leading Role <b data-id=\"nm0000209\">Tim Robbins</b></p>"}]}]}
    {:eventTitle "20/20 Awards",
     :eventYear "2015",
     :outcomeItems
     [{:outcomeTitle "Winner",
       :outcomeCategory "Felix",
       :outcomeDetails
       [{:plainText "Best Adapted Screenplay Frank Darabont",
         :html
         "<p>Best Adapted Screenplay <b data-id=\"nm0001104\">Frank Darabont</b></p>"}
        {:plainText "Best Cinematography Roger Deakins",
         :html
         "<p>Best Cinematography <b data-id=\"nm0005683\">Roger Deakins</b></p>"}]}
      {:outcomeTitle "Nominee",
       :outcomeCategory "Felix",
       :outcomeDetails
       [{:plainText "Best Picture", :html "<p>Best Picture</p>"}
        {:plainText "Best Director Frank Darabont",
         :html
         "<p>Best Director <b data-id=\"nm0001104\">Frank Darabont</b></p>"}
        {:plainText "Best Actor Morgan Freeman",
         :html "<p>Best Actor <b data-id=\"nm0000151\">Morgan Freeman</b></p>"}
        {:plainText "Best Original Score Thomas Newman",
         :html
         "<p>Best Original Score <b data-id=\"nm0002353\">Thomas Newman</b></p>"}
        {:plainText "Best Film Editing Richard Francis-Bruce",
         :html
         "<p>Best Film Editing <b data-id=\"nm0290358\">Richard Francis-Bruce</b></p>"}]}]}
    {:eventTitle "Academy of Science Fiction, Fantasy & Horror Films, USA",
     :eventYear "2016",
     :outcomeItems
     [{:outcomeTitle "Winner",
       :outcomeCategory "Saturn Award",
       :outcomeDetails
       [{:plainText
         "Best DVD/Blu-Ray Collection For The Green Mile and The Majestic As a part of \"The Frank Darabont Collection\".",
         :html
         "<p>Best DVD/Blu-Ray Collection For <b data-id=\"tt0120689\">The Green Mile</b> and <b data-id=\"tt0268995\">The Majestic</b> <span> As a part of \"The Frank Darabont Collection\". </span></p>"}]}]}
    {:eventTitle "Academy of Science Fiction, Fantasy & Horror Films, USA",
     :eventYear "1995",
     :outcomeItems
     [{:outcomeTitle "Nominee",
       :outcomeCategory "Saturn Award",
       :outcomeDetails
       [{:plainText "Best Action/Adventure/Thriller Film",
         :html "<p>Best Action/Adventure/Thriller Film</p>"}
        {:plainText "Best Writing Frank Darabont",
         :html
         "<p>Best Writing <b data-id=\"nm0001104\">Frank Darabont</b></p>"}]}]}
    {:eventTitle "American Cinema Editors, USA",
     :eventYear "1995",
     :outcomeItems
     [{:outcomeTitle "Nominee",
       :outcomeCategory "Eddie",
       :outcomeDetails
       [{:plainText "Best Edited Feature Film Richard Francis-Bruce",
         :html
         "<p>Best Edited Feature Film <b data-id=\"nm0290358\">Richard Francis-Bruce</b></p>"}]}]}
    {:eventTitle "American Society of Cinematographers, USA",
     :eventYear "1995",
     :outcomeItems
     [{:outcomeTitle "Winner",
       :outcomeCategory "ASC Award",
       :outcomeDetails
       [{:plainText
         "Outstanding Achievement in Cinematography in Theatrical Releases Roger Deakins",
         :html
         "<p>Outstanding Achievement in Cinematography in Theatrical Releases <b data-id=\"nm0005683\">Roger Deakins</b></p>"}]}]}
    {:eventTitle "Awards Circuit Community Awards",
     :eventYear "1994",
     :outcomeItems
     [{:outcomeTitle "Winner",
       :outcomeCategory "ACCA",
       :outcomeDetails
       [{:plainText "Best Adapted Screenplay Frank Darabont",
         :html
         "<p>Best Adapted Screenplay <b data-id=\"nm0001104\">Frank Darabont</b></p>"}
        {:plainText "Best Cinematography Roger Deakins",
         :html
         "<p>Best Cinematography <b data-id=\"nm0005683\">Roger Deakins</b></p>"}]}
      {:outcomeTitle "Nominee",
       :outcomeCategory "ACCA",
       :outcomeDetails
       [{:plainText "Best Motion Picture Niki Marvin",
         :html
         "<p>Best Motion Picture <b data-id=\"nm0555550\">Niki Marvin</b></p>"}
        {:plainText "Best Director Frank Darabont",
         :html
         "<p>Best Director <b data-id=\"nm0001104\">Frank Darabont</b></p>"}
        {:plainText "Best Actor in a Leading Role Morgan Freeman",
         :html
         "<p>Best Actor in a Leading Role <b data-id=\"nm0000151\">Morgan Freeman</b></p>"}
        {:plainText "Best Actor in a Leading Role Tim Robbins",
         :html
         "<p>Best Actor in a Leading Role <b data-id=\"nm0000209\">Tim Robbins</b></p>"}
        {:plainText
         "Best Art Direction Terence Marsh Peter Landsdown Smith Tied with Tom Duffield and Okowita for Ed Wood (1994) for second place.",
         :html
         "<p>Best Art Direction <b data-id=\"nm0550671\">Terence Marsh</b> <b data-id=\"nm0809593\">Peter Landsdown Smith</b> <span> Tied with <b data-id=\"nm0240468\">Tom Duffield</b> and <b data-id=\"nm0645698\">Okowita</b> for <b data-id=\"tt0109707\">Ed Wood</b> (1994) for second place. </span></p>"}
        {:plainText
         "Best Costume Design Elizabeth McBride Tied with Tim Chappel and Lizzy Gardiner for The Adventures of Priscilla, Queen of the Desert (1994)... More Tied with Tim Chappel and Lizzy Gardiner for The Adventures of Priscilla, Queen of the Desert (1994) for second place.",
         :html
         "<p>Best Costume Design <b data-id=\"nm0564296\">Elizabeth McBride</b> <span> <p class=\"truncated-note\"> Tied with <b data-id=\"nm0152579\">Tim Chappel</b> and <b data-id=\"nm0306773\">Lizzy Gardiner</b> for <b data-id=\"tt0109045\">The Adventures of Priscilla, Queen of the Desert</b> (1994)... <b data-id=\"javascript: void(0);\">More</b> </p> <p class=\"full-note\"> Tied with <b data-id=\"nm0152579\">Tim Chappel</b> and <b data-id=\"nm0306773\">Lizzy Gardiner</b> for <b data-id=\"tt0109045\">The Adventures of Priscilla, Queen of the Desert</b> (1994) for second place. </p> </span></p>"}
        {:plainText "Best Film Editing Richard Francis-Bruce",
         :html
         "<p>Best Film Editing <b data-id=\"nm0290358\">Richard Francis-Bruce</b></p>"}
        {:plainText "Best Achievement in Sound",
         :html "<p>Best Achievement in Sound</p>"}
        {:plainText "Best Original Score Thomas Newman",
         :html
         "<p>Best Original Score <b data-id=\"nm0002353\">Thomas Newman</b></p>"}
        {:plainText
         "Best Cast Ensemble Tim Robbins Morgan Freeman Bob Gunton William Sadler Clancy Brown Gil Bellows Mark Rolston James Whitmore",
         :html
         "<p>Best Cast Ensemble <b data-id=\"nm0000209\">Tim Robbins</b> <b data-id=\"nm0000151\">Morgan Freeman</b> <b data-id=\"nm0348409\">Bob Gunton</b> <b data-id=\"nm0006669\">William Sadler</b> <b data-id=\"nm0000317\">Clancy Brown</b> <b data-id=\"nm0004743\">Gil Bellows</b> <b data-id=\"nm0001679\">Mark Rolston</b> <b data-id=\"nm0926235\">James Whitmore</b></p>"}]}]}
    {:eventTitle "Awards of the Japanese Academy",
     :eventYear "1996",
     :outcomeItems
     [{:outcomeTitle "Winner",
       :outcomeCategory "Award of the Japanese Academy",
       :outcomeDetails
       [{:plainText "Best Foreign Film", :html "<p>Best Foreign Film</p>"}]}]}
    {:eventTitle "Camerimage",
     :eventYear "1995",
     :outcomeItems
     [{:outcomeTitle "Winner",
       :outcomeCategory "Bronze Frog",
       :outcomeDetails
       [{:plainText "Roger Deakins",
         :html "<p><b data-id=\"nm0005683\">Roger Deakins</b></p>"}]}
      {:outcomeTitle "Nominee",
       :outcomeCategory "Golden Frog",
       :outcomeDetails
       [{:plainText "Roger Deakins",
         :html "<p><b data-id=\"nm0005683\">Roger Deakins</b></p>"}]}]}
    {:eventTitle "Casting Society of America, USA",
     :eventYear "1995",
     :outcomeItems
     [{:outcomeTitle "Nominee",
       :outcomeCategory "Artios Award",
       :outcomeDetails
       [{:plainText "Best Casting for Feature Film, Drama Deborah Aquila",
         :html
         "<p>Best Casting for Feature Film, Drama <b data-id=\"nm0032597\">Deborah Aquila</b></p>"}]}]}
    {:eventTitle "Chicago Film Critics Association Awards",
     :eventYear "1995",
     :outcomeItems
     [{:outcomeTitle "Nominee",
       :outcomeCategory "CFCA Award",
       :outcomeDetails
       [{:plainText "Best Supporting Actor Morgan Freeman",
         :html
         "<p>Best Supporting Actor <b data-id=\"nm0000151\">Morgan Freeman</b></p>"}
        {:plainText "Best Picture", :html "<p>Best Picture</p>"}
        {:plainText "Best Screenplay Frank Darabont",
         :html
         "<p>Best Screenplay <b data-id=\"nm0001104\">Frank Darabont</b></p>"}]}]}
    {:eventTitle "Chlotrudis Awards",
     :eventYear "1995",
     :outcomeItems
     [{:outcomeTitle "Winner",
       :outcomeCategory "Chlotrudis Award",
       :outcomeDetails
       [{:plainText
         "Best Actor Morgan Freeman Tied with Wallace Shawn for Vanya on 42nd Street (1994).",
         :html
         "<p>Best Actor <b data-id=\"nm0000151\">Morgan Freeman</b> <span> Tied with <b data-id=\"nm0001728\">Wallace Shawn</b> for <b data-id=\"tt0111590\">Vanya on 42nd Street</b> (1994). </span></p>"}]}
      {:outcomeTitle "Nominee",
       :outcomeCategory "Chlotrudis Award",
       :outcomeDetails
       [{:plainText "Best Actor Tim Robbins",
         :html
         "<p>Best Actor <b data-id=\"nm0000209\">Tim Robbins</b></p>"}]}]}
    {:eventTitle "Dallas-Fort Worth Film Critics Association Awards",
     :eventYear "1995",
     :outcomeItems
     [{:outcomeTitle "Winner",
       :outcomeCategory "DFWFCA Award",
       :outcomeDetails
       [{:plainText
         "Best Cinematography Roger Deakins Tied with John Toll for Legends of the Fall (1994).",
         :html
         "<p>Best Cinematography <b data-id=\"nm0005683\">Roger Deakins</b> <span> Tied with <b data-id=\"nm0001799\">John Toll</b> for <b data-id=\"tt0110322\">Legends of the Fall</b> (1994). </span></p>"}]}
      {:outcomeTitle "Nominee",
       :outcomeCategory "DFWFCA Award",
       :outcomeDetails
       [{:plainText "Best Picture", :html "<p>Best Picture</p>"}
        {:plainText "Best Actor Morgan Freeman",
         :html
         "<p>Best Actor <b data-id=\"nm0000151\">Morgan Freeman</b></p>"}]}]}
    {:eventTitle "Directors Guild of America, USA",
     :eventYear "1995",
     :outcomeItems
     [{:outcomeTitle "Nominee",
       :outcomeCategory "DGA Award",
       :outcomeDetails
       [{:plainText
         "Outstanding Directorial Achievement in Motion Pictures Frank Darabont",
         :html
         "<p>Outstanding Directorial Achievement in Motion Pictures <b data-id=\"nm0001104\">Frank Darabont</b></p>"}]}]}
    {:eventTitle "Faro Island Film Festival",
     :eventYear "1994",
     :outcomeItems
     [{:outcomeTitle "Nominee",
       :outcomeCategory "Golden Train Award",
       :outcomeDetails
       [{:plainText "Best Film Frank Darabont",
         :html
         "<p>Best Film <b data-id=\"nm0001104\">Frank Darabont</b></p>"}]}]}
    {:eventTitle "Golden Globes, USA",
     :eventYear "1995",
     :outcomeItems
     [{:outcomeTitle "Nominee",
       :outcomeCategory "Golden Globe",
       :outcomeDetails
       [{:plainText
         "Best Performance by an Actor in a Motion Picture - Drama Morgan Freeman",
         :html
         "<p>Best Performance by an Actor in a Motion Picture - Drama <b data-id=\"nm0000151\">Morgan Freeman</b></p>"}
        {:plainText "Best Screenplay - Motion Picture Frank Darabont",
         :html
         "<p>Best Screenplay - Motion Picture <b data-id=\"nm0001104\">Frank Darabont</b></p>"}]}]}
    {:eventTitle "Grammy Awards",
     :eventYear "1995",
     :outcomeItems
     [{:outcomeTitle "Nominee",
       :outcomeCategory "Grammy",
       :outcomeDetails
       [{:plainText
         "Best Instrumental Composition Written for a Motion Picture or for Television Thomas Newman",
         :html
         "<p>Best Instrumental Composition Written for a Motion Picture or for Television <b data-id=\"nm0002353\">Thomas Newman</b></p>"}]}]}
    {:eventTitle "Heartland International Film Festival",
     :eventYear "1995",
     :outcomeItems
     [{:outcomeTitle "Winner",
       :outcomeCategory "Studio Crystal Heart Award",
       :outcomeDetails
       [{:plainText "Frank Darabont",
         :html "<p><b data-id=\"nm0001104\">Frank Darabont</b></p>"}]}]}
    {:eventTitle "Hochi Film Awards",
     :eventYear "1995",
     :outcomeItems
     [{:outcomeTitle "Winner",
       :outcomeCategory "Hochi Film Award",
       :outcomeDetails
       [{:plainText "Best Foreign Language Film Frank Darabont",
         :html
         "<p>Best Foreign Language Film <b data-id=\"nm0001104\">Frank Darabont</b></p>"}]}]}
    {:eventTitle "Humanitas Prize",
     :eventYear "1995",
     :outcomeItems
     [{:outcomeTitle "Winner",
       :outcomeCategory "Humanitas Prize",
       :outcomeDetails
       [{:plainText "Feature Film Category Frank Darabont",
         :html
         "<p>Feature Film Category <b data-id=\"nm0001104\">Frank Darabont</b></p>"}]}]}
    {:eventTitle "Kinema Junpo Awards",
     :eventYear "1996",
     :outcomeItems
     [{:outcomeTitle "Winner",
       :outcomeCategory "Kinema Junpo Award",
       :outcomeDetails
       [{:plainText "Best Foreign Language Film Frank Darabont",
         :html
         "<p>Best Foreign Language Film <b data-id=\"nm0001104\">Frank Darabont</b></p>"}]}
      {:outcomeTitle "Winner",
       :outcomeCategory "Readers' Choice Award",
       :outcomeDetails
       [{:plainText "Best Foreign Language Film Frank Darabont",
         :html
         "<p>Best Foreign Language Film <b data-id=\"nm0001104\">Frank Darabont</b></p>"}]}]}
    {:eventTitle "Mainichi Film Concours",
     :eventYear "1996",
     :outcomeItems
     [{:outcomeTitle "Winner",
       :outcomeCategory "Mainichi Film Concours",
       :outcomeDetails
       [{:plainText "Best Foreign Language Film Frank Darabont",
         :html
         "<p>Best Foreign Language Film <b data-id=\"nm0001104\">Frank Darabont</b></p>"}]}]}
    {:eventTitle "National Board of Review, USA",
     :eventYear "1994",
     :outcomeItems
     [{:outcomeTitle "Winner",
       :outcomeCategory "NBR Award",
       :outcomeDetails
       [{:plainText "Top Ten Films", :html "<p>Top Ten Films</p>"}]}]}
    {:eventTitle "National Film Preservation Board, USA",
     :eventYear "2015",
     :outcomeItems
     [{:outcomeTitle "Winner",
       :outcomeCategory "National Film Registry",
       :outcomeDetails
       [{:plainText "National Film Preservation Board",
         :html "<p>National Film Preservation Board</p>"}]}]}
    {:eventTitle "Online Film & Television Association",
     :eventYear "1997",
     :outcomeItems
     [{:outcomeTitle "Winner",
       :outcomeCategory "OFTA Film Hall of Fame",
       :outcomeDetails
       [{:plainText "Motion Picture", :html "<p>Motion Picture</p>"}]}]}
    {:eventTitle "PEN Center USA West Literary Awards",
     :eventYear "1995",
     :outcomeItems
     [{:outcomeTitle "Winner",
       :outcomeCategory "Literary Award",
       :outcomeDetails
       [{:plainText "Screenplay Frank Darabont",
         :html
         "<p>Screenplay <b data-id=\"nm0001104\">Frank Darabont</b></p>"}]}]}
    {:eventTitle "Southeastern Film Critics Association Awards",
     :eventYear "1995",
     :outcomeItems
     [{:outcomeTitle "Nominee",
       :outcomeCategory "SEFCA Award",
       :outcomeDetails
       [{:plainText "Best Picture 7th place",
         :html "<p>Best Picture <span> 7th place </span></p>"}]}]}
    {:eventTitle "Turkish Film Critics Association (SIYAD) Awards",
     :eventYear "1995",
     :outcomeItems
     [{:outcomeTitle "Nominee",
       :outcomeCategory "SIYAD Award",
       :outcomeDetails
       [{:plainText "Best Foreign Film 8th Place",
         :html "<p>Best Foreign Film <span> 8th Place </span></p>"}]}]}
    {:eventTitle "USC Scripter Award",
     :eventYear "1995",
     :outcomeItems
     [{:outcomeTitle "Winner",
       :outcomeCategory "USC Scripter Award",
       :outcomeDetails
       [{:plainText "Stephen King (author) Frank Darabont (screenwriter)",
         :html
         "<p><b data-id=\"nm0000175\">Stephen King</b> <small>(author)</small> <b data-id=\"nm0001104\">Frank Darabont</b> <small>(screenwriter)</small></p>"}]}]}
    {:eventTitle "Writers Guild of America, USA",
     :eventYear "1995",
     :outcomeItems
     [{:outcomeTitle "Nominee",
       :outcomeCategory "WGA Award (Screen)",
       :outcomeDetails
       [{:plainText
         "Best Screenplay Based on Material Previously Produced or Published Frank Darabont",
         :html
         "<p>Best Screenplay Based on Material Previously Produced or Published <b data-id=\"nm0001104\">Frank Darabont</b></p>"}]}]}],
   :fullTitle "The Shawshank Redemption (1994)",
   :awardsHtml "deleted this"
   })

(def top-250-movies
 {:items
  [{:imDbRatingCount "2633309",
    :rank "1",
    :crew "Frank Darabont (dir.), Tim Robbins, Morgan Freeman",
    :imDbRating "9.2",
    :title "The Shawshank Redemption",
    :year "1994",
    :id "tt0111161",
    :image
    "https://m.media-amazon.com/images/M/MV5BMDFkYTc0MGEtZmNhMC00ZDIzLWFmNTEtODM1ZmRlYWMwMWFmXkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "The Shawshank Redemption (1994)"}
   {:imDbRatingCount "1824997",
    :rank "2",
    :crew "Francis Ford Coppola (dir.), Marlon Brando, Al Pacino",
    :imDbRating "9.2",
    :title "The Godfather",
    :year "1972",
    :id "tt0068646",
    :image
    "https://m.media-amazon.com/images/M/MV5BM2MyNjYxNmUtYTAwNi00MTYxLWJmNWYtYzZlODY3ZTk3OTFlXkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "The Godfather (1972)"}
   {:imDbRatingCount "2604597",
    :rank "3",
    :crew "Christopher Nolan (dir.), Christian Bale, Heath Ledger",
    :imDbRating "9.0",
    :title "The Dark Knight",
    :year "2008",
    :id "tt0468569",
    :image
    "https://m.media-amazon.com/images/M/MV5BMTMxNTMwODM0NF5BMl5BanBnXkFtZTcwODAyMTk2Mw@@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "The Dark Knight (2008)"}
   {:imDbRatingCount "1251893",
    :rank "4",
    :crew "Francis Ford Coppola (dir.), Al Pacino, Robert De Niro",
    :imDbRating "9.0",
    :title "The Godfather Part II",
    :year "1974",
    :id "tt0071562",
    :image
    "https://m.media-amazon.com/images/M/MV5BMWMwMGQzZTItY2JlNC00OWZiLWIyMDctNDk2ZDQ2YjRjMWQ0XkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "The Godfather Part II (1974)"}
   {:imDbRatingCount "777652",
    :rank "5",
    :crew "Sidney Lumet (dir.), Henry Fonda, Lee J. Cobb",
    :imDbRating "8.9",
    :title "12 Angry Men",
    :year "1957",
    :id "tt0050083",
    :image
    "https://m.media-amazon.com/images/M/MV5BMWU4N2FjNzYtNTVkNC00NzQ0LTg0MjAtYTJlMjFhNGUxZDFmXkEyXkFqcGdeQXVyNjc1NTYyMjg@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "12 Angry Men (1957)"}
   {:imDbRatingCount "1336012",
    :rank "6",
    :crew "Steven Spielberg (dir.), Liam Neeson, Ralph Fiennes",
    :imDbRating "8.9",
    :title "Schindler's List",
    :year "1993",
    :id "tt0108052",
    :image
    "https://m.media-amazon.com/images/M/MV5BNDE4OTMxMTctNmRhYy00NWE2LTg3YzItYTk3M2UwOTU5Njg4XkEyXkFqcGdeQXVyNjU0OTQ0OTY@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Schindler's List (1993)"}
   {:imDbRatingCount "1806306",
    :rank "7",
    :crew "Peter Jackson (dir.), Elijah Wood, Viggo Mortensen",
    :imDbRating "8.9",
    :title "The Lord of the Rings: The Return of the King",
    :year "2003",
    :id "tt0167260",
    :image
    "https://m.media-amazon.com/images/M/MV5BNzA5ZDNlZWMtM2NhNS00NDJjLTk4NDItYTRmY2EwMWZlMTY3XkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "The Lord of the Rings: The Return of the King (2003)"}
   {:imDbRatingCount "2015630",
    :rank "8",
    :crew "Quentin Tarantino (dir.), John Travolta, Uma Thurman",
    :imDbRating "8.8",
    :title "Pulp Fiction",
    :year "1994",
    :id "tt0110912",
    :image
    "https://m.media-amazon.com/images/M/MV5BNGNhMDIzZTUtNTBlZi00MTRlLWFjM2ItYzViMjE3YzI5MjljXkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Pulp Fiction (1994)"}
   {:imDbRatingCount "1828206",
    :rank "9",
    :crew "Peter Jackson (dir.), Elijah Wood, Ian McKellen",
    :imDbRating "8.8",
    :title "The Lord of the Rings: The Fellowship of the Ring",
    :year "2001",
    :id "tt0120737",
    :image
    "https://m.media-amazon.com/images/M/MV5BN2EyZjM3NzUtNWUzMi00MTgxLWI0NTctMzY4M2VlOTdjZWRiXkEyXkFqcGdeQXVyNDUzOTQ5MjY@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "The Lord of the Rings: The Fellowship of the Ring (2001)"}
   {:imDbRatingCount "752633",
    :rank "10",
    :crew "Sergio Leone (dir.), Clint Eastwood, Eli Wallach",
    :imDbRating "8.8",
    :title "The Good, the Bad and the Ugly",
    :year "1966",
    :id "tt0060196",
    :image
    "https://m.media-amazon.com/images/M/MV5BNjJlYmNkZGItM2NhYy00MjlmLTk5NmQtNjg1NmM2ODU4OTMwXkEyXkFqcGdeQXVyMjUzOTY1NTc@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "The Good, the Bad and the Ugly (1966)"}
   {:imDbRatingCount "2038306",
    :rank "11",
    :crew "Robert Zemeckis (dir.), Tom Hanks, Robin Wright",
    :imDbRating "8.8",
    :title "Forrest Gump",
    :year "1994",
    :id "tt0109830",
    :image
    "https://m.media-amazon.com/images/M/MV5BNWIwODRlZTUtY2U3ZS00Yzg1LWJhNzYtMmZiYmEyNmU1NjMzXkEyXkFqcGdeQXVyMTQxNzMzNDI@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Forrest Gump (1994)"}
   {:imDbRatingCount "2077200",
    :rank "12",
    :crew "David Fincher (dir.), Brad Pitt, Edward Norton",
    :imDbRating "8.7",
    :title "Fight Club",
    :year "1999",
    :id "tt0137523",
    :image
    "https://m.media-amazon.com/images/M/MV5BNDIzNDU0YzEtYzE5Ni00ZjlkLTk5ZjgtNjM3NWE4YzA3Nzk3XkEyXkFqcGdeQXVyMjUzOTY1NTc@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Fight Club (1999)"}
   {:imDbRatingCount "2309449",
    :rank "13",
    :crew "Christopher Nolan (dir.), Leonardo DiCaprio, Joseph Gordon-Levitt",
    :imDbRating "8.7",
    :title "Inception",
    :year "2010",
    :id "tt1375666",
    :image
    "https://m.media-amazon.com/images/M/MV5BMjAxMzY3NjcxNF5BMl5BanBnXkFtZTcwNTI5OTM0Mw@@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Inception (2010)"}
   {:imDbRatingCount "1631166",
    :rank "14",
    :crew "Peter Jackson (dir.), Elijah Wood, Ian McKellen",
    :imDbRating "8.7",
    :title "The Lord of the Rings: The Two Towers",
    :year "2002",
    :id "tt0167261",
    :image
    "https://m.media-amazon.com/images/M/MV5BZGMxZTdjZmYtMmE2Ni00ZTdkLWI5NTgtNjlmMjBiNzU2MmI5XkEyXkFqcGdeQXVyNjU0OTQ0OTY@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "The Lord of the Rings: The Two Towers (2002)"}
   {:imDbRatingCount "1273476",
    :rank "15",
    :crew "Irvin Kershner (dir.), Mark Hamill, Harrison Ford",
    :imDbRating "8.7",
    :title "Star Wars: Episode V - The Empire Strikes Back",
    :year "1980",
    :id "tt0080684",
    :image
    "https://m.media-amazon.com/images/M/MV5BYmU1NDRjNDgtMzhiMi00NjZmLTg5NGItZDNiZjU5NTU4OTE0XkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Star Wars: Episode V - The Empire Strikes Back (1980)"}
   {:imDbRatingCount "1885095",
    :rank "16",
    :crew "Lana Wachowski (dir.), Keanu Reeves, Laurence Fishburne",
    :imDbRating "8.7",
    :title "The Matrix",
    :year "1999",
    :id "tt0133093",
    :image
    "https://m.media-amazon.com/images/M/MV5BNzQzOTk3OTAtNDQ0Zi00ZTVkLWI0MTEtMDllZjNkYzNjNTc4L2ltYWdlXkEyXkFqcGdeQXVyNjU0OTQ0OTY@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "The Matrix (1999)"}
   {:imDbRatingCount "1141018",
    :rank "17",
    :crew "Martin Scorsese (dir.), Robert De Niro, Ray Liotta",
    :imDbRating "8.7",
    :title "Goodfellas",
    :year "1990",
    :id "tt0099685",
    :image
    "https://m.media-amazon.com/images/M/MV5BY2NkZjEzMDgtN2RjYy00YzM1LWI4ZmQtMjIwYjFjNmI3ZGEwXkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Goodfellas (1990)"}
   {:imDbRatingCount "995861",
    :rank "18",
    :crew "Milos Forman (dir.), Jack Nicholson, Louise Fletcher",
    :imDbRating "8.6",
    :title "One Flew Over the Cuckoo's Nest",
    :year "1975",
    :id "tt0073486",
    :image
    "https://m.media-amazon.com/images/M/MV5BZjA0OWVhOTAtYWQxNi00YzNhLWI4ZjYtNjFjZTEyYjJlNDVlL2ltYWdlL2ltYWdlXkEyXkFqcGdeQXVyMTQxNzMzNDI@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "One Flew Over the Cuckoo's Nest (1975)"}
   {:imDbRatingCount "1619206",
    :rank "19",
    :crew "David Fincher (dir.), Morgan Freeman, Brad Pitt",
    :imDbRating "8.6",
    :title "Se7en",
    :year "1995",
    :id "tt0114369",
    :image
    "https://m.media-amazon.com/images/M/MV5BOTUwODM5MTctZjczMi00OTk4LTg3NWUtNmVhMTAzNTNjYjcyXkEyXkFqcGdeQXVyNjU0OTQ0OTY@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Se7en (1995)"}
   {:imDbRatingCount "343053",
    :rank "20",
    :crew "Akira Kurosawa (dir.), Toshirô Mifune, Takashi Shimura",
    :imDbRating "8.6",
    :title "Seven Samurai",
    :year "1954",
    :id "tt0047478",
    :image
    "https://m.media-amazon.com/images/M/MV5BNWQ3OTM4ZGItMWEwZi00MjI5LWI3YzgtNTYwNWRkNmIzMGI5XkEyXkFqcGdeQXVyNDY2MTk1ODk@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Seven Samurai (1954)"}
   {:imDbRatingCount "450598",
    :rank "21",
    :crew "Frank Capra (dir.), James Stewart, Donna Reed",
    :imDbRating "8.6",
    :title "It's a Wonderful Life",
    :year "1946",
    :id "tt0038650",
    :image
    "https://m.media-amazon.com/images/M/MV5BZjc4NDZhZWMtNGEzYS00ZWU2LThlM2ItNTA0YzQ0OTExMTE2XkEyXkFqcGdeQXVyNjUwMzI2NzU@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "It's a Wonderful Life (1946)"}
   {:imDbRatingCount "1407621",
    :rank "22",
    :crew "Jonathan Demme (dir.), Jodie Foster, Anthony Hopkins",
    :imDbRating "8.6",
    :title "The Silence of the Lambs",
    :year "1991",
    :id "tt0102926",
    :image
    "https://m.media-amazon.com/images/M/MV5BNjNhZTk0ZmEtNjJhMi00YzFlLWE1MmEtYzM1M2ZmMGMwMTU4XkEyXkFqcGdeQXVyNjU0OTQ0OTY@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "The Silence of the Lambs (1991)"}
   {:imDbRatingCount "749248",
    :rank "23",
    :crew "Fernando Meirelles (dir.), Alexandre Rodrigues, Leandro Firmino",
    :imDbRating "8.6",
    :title "City of God",
    :year "2002",
    :id "tt0317248",
    :image
    "https://m.media-amazon.com/images/M/MV5BOTMwYjc5ZmItYTFjZC00ZGQ3LTlkNTMtMjZiNTZlMWQzNzI5XkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "City of God (2002)"}
   {:imDbRatingCount "1369296",
    :rank "24",
    :crew "Steven Spielberg (dir.), Tom Hanks, Matt Damon",
    :imDbRating "8.6",
    :title "Saving Private Ryan",
    :year "1998",
    :id "tt0120815",
    :image
    "https://m.media-amazon.com/images/M/MV5BZjhkMDM4MWItZTVjOC00ZDRhLThmYTAtM2I5NzBmNmNlMzI1XkEyXkFqcGdeQXVyNDYyMDk5MTU@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Saving Private Ryan (1998)"}
   {:imDbRatingCount "685815",
    :rank "25",
    :crew "Roberto Benigni (dir.), Roberto Benigni, Nicoletta Braschi",
    :imDbRating "8.6",
    :title "Life Is Beautiful",
    :year "1997",
    :id "tt0118799",
    :image
    "https://m.media-amazon.com/images/M/MV5BYmJmM2Q4NmMtYThmNC00ZjRlLWEyZmItZTIwOTBlZDQ3NTQ1XkEyXkFqcGdeQXVyMTQxNzMzNDI@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Life Is Beautiful (1997)"}
   {:imDbRatingCount "1278968",
    :rank "26",
    :crew "Frank Darabont (dir.), Tom Hanks, Michael Clarke Duncan",
    :imDbRating "8.6",
    :title "The Green Mile",
    :year "1999",
    :id "tt0120689",
    :image
    "https://m.media-amazon.com/images/M/MV5BMTUxMzQyNjA5MF5BMl5BanBnXkFtZTYwOTU2NTY3._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "The Green Mile (1999)"}
   {:imDbRatingCount "1775486",
    :rank "27",
    :crew "Christopher Nolan (dir.), Matthew McConaughey, Anne Hathaway",
    :imDbRating "8.6",
    :title "Interstellar",
    :year "2014",
    :id "tt0816692",
    :image
    "https://m.media-amazon.com/images/M/MV5BZjdkOTU3MDktN2IxOS00OGEyLWFmMjktY2FiMmZkNWIyODZiXkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Interstellar (2014)"}
   {:imDbRatingCount "1346133",
    :rank "28",
    :crew "George Lucas (dir.), Mark Hamill, Harrison Ford",
    :imDbRating "8.6",
    :title "Star Wars",
    :year "1977",
    :id "tt0076759",
    :image
    "https://m.media-amazon.com/images/M/MV5BNzg4MjQxNTQtZmI5My00YjMwLWJlMjUtMmJlY2U2ZWFlNzY1XkEyXkFqcGdeQXVyODk4OTc3MTY@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Star Wars (1977)"}
   {:imDbRatingCount "1083823",
    :rank "29",
    :crew "James Cameron (dir.), Arnold Schwarzenegger, Linda Hamilton",
    :imDbRating "8.5",
    :title "Terminator 2: Judgment Day",
    :year "1991",
    :id "tt0103064",
    :image
    "https://m.media-amazon.com/images/M/MV5BMGU2NzRmZjUtOGUxYS00ZjdjLWEwZWItY2NlM2JhNjkxNTFmXkEyXkFqcGdeQXVyNjU0OTQ0OTY@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Terminator 2: Judgment Day (1991)"}
   {:imDbRatingCount "1182496",
    :rank "30",
    :crew "Robert Zemeckis (dir.), Michael J. Fox, Christopher Lloyd",
    :imDbRating "8.5",
    :title "Back to the Future",
    :year "1985",
    :id "tt0088763",
    :image
    "https://m.media-amazon.com/images/M/MV5BZmU0M2Y1OGUtZjIxNi00ZjBkLTg1MjgtOWIyNThiZWIwYjRiXkEyXkFqcGdeQXVyMTQxNzMzNDI@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Back to the Future (1985)"}
   {:imDbRatingCount "747955",
    :rank "31",
    :crew "Hayao Miyazaki (dir.), Daveigh Chase, Suzanne Pleshette",
    :imDbRating "8.5",
    :title "Spirited Away",
    :year "2001",
    :id "tt0245429",
    :image
    "https://m.media-amazon.com/images/M/MV5BMjlmZmI5MDctNDE2YS00YWE0LWE5ZWItZDBhYWQ0NTcxNWRhXkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Spirited Away (2001)"}
   {:imDbRatingCount "662891",
    :rank "32",
    :crew "Alfred Hitchcock (dir.), Anthony Perkins, Janet Leigh",
    :imDbRating "8.5",
    :title "Psycho",
    :year "1960",
    :id "tt0054215",
    :image
    "https://m.media-amazon.com/images/M/MV5BNTQwNDM1YzItNDAxZC00NWY2LTk0M2UtNDIwNWI5OGUyNWUxXkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Psycho (1960)"}
   {:imDbRatingCount "818470",
    :rank "33",
    :crew "Roman Polanski (dir.), Adrien Brody, Thomas Kretschmann",
    :imDbRating "8.5",
    :title "The Pianist",
    :year "2002",
    :id "tt0253474",
    :image
    "https://m.media-amazon.com/images/M/MV5BOWRiZDIxZjktMTA1NC00MDQ2LWEzMjUtMTliZmY3NjQ3ODJiXkEyXkFqcGdeQXVyNjU0OTQ0OTY@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "The Pianist (2002)"}
   {:imDbRatingCount "1143728",
    :rank "34",
    :crew "Luc Besson (dir.), Jean Reno, Gary Oldman",
    :imDbRating "8.5",
    :title "Léon: The Professional",
    :year "1994",
    :id "tt0110413",
    :image
    "https://m.media-amazon.com/images/M/MV5BODllNWE0MmEtYjUwZi00ZjY3LThmNmQtZjZlMjI2YTZjYmQ0XkEyXkFqcGdeQXVyNTc1NTQxODI@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Léon: The Professional (1994)"}
   {:imDbRatingCount "771499",
    :rank "35",
    :crew "Bong Joon Ho (dir.), Song Kang-ho, Sun-kyun Lee",
    :imDbRating "8.5",
    :title "Parasite",
    :year "2019",
    :id "tt6751668",
    :image
    "https://m.media-amazon.com/images/M/MV5BYWZjMjk3ZTItODQ2ZC00NTY5LWE0ZDYtZTI3MjcwN2Q5NTVkXkEyXkFqcGdeQXVyODk4OTc3MTY@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Parasite (2019)"}
   {:imDbRatingCount "1041960",
    :rank "36",
    :crew "Roger Allers (dir.), Matthew Broderick, Jeremy Irons",
    :imDbRating "8.5",
    :title "The Lion King",
    :year "1994",
    :id "tt0110357",
    :image
    "https://m.media-amazon.com/images/M/MV5BYTYxNGMyZTYtMjE3MS00MzNjLWFjNmYtMDk3N2FmM2JiM2M1XkEyXkFqcGdeQXVyNjY5NDU4NzI@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "The Lion King (1994)"}
   {:imDbRatingCount "1476563",
    :rank "37",
    :crew "Ridley Scott (dir.), Russell Crowe, Joaquin Phoenix",
    :imDbRating "8.5",
    :title "Gladiator",
    :year "2000",
    :id "tt0172495",
    :image
    "https://m.media-amazon.com/images/M/MV5BMDliMmNhNDEtODUyOS00MjNlLTgxODEtN2U3NzIxMGVkZTA1L2ltYWdlXkEyXkFqcGdeQXVyNjU0OTQ0OTY@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Gladiator (2000)"}
   {:imDbRatingCount "1109462",
    :rank "38",
    :crew "Tony Kaye (dir.), Edward Norton, Edward Furlong",
    :imDbRating "8.5",
    :title "American History X",
    :year "1998",
    :id "tt0120586",
    :image
    "https://m.media-amazon.com/images/M/MV5BZTJhN2FkYWEtMGI0My00YWM4LWI2MjAtM2UwNjY4MTI2ZTQyXkEyXkFqcGdeQXVyNjc3MjQzNTI@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "American History X (1998)"}
   {:imDbRatingCount "1306230",
    :rank "39",
    :crew "Martin Scorsese (dir.), Leonardo DiCaprio, Matt Damon",
    :imDbRating "8.5",
    :title "The Departed",
    :year "2006",
    :id "tt0407887",
    :image
    "https://m.media-amazon.com/images/M/MV5BMTI1MTY2OTIxNV5BMl5BanBnXkFtZTYwNjQ4NjY3._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "The Departed (2006)"}
   {:imDbRatingCount "1072847",
    :rank "40",
    :crew "Bryan Singer (dir.), Kevin Spacey, Gabriel Byrne",
    :imDbRating "8.5",
    :title "The Usual Suspects",
    :year "1995",
    :id "tt0114814",
    :image
    "https://m.media-amazon.com/images/M/MV5BYTViNjMyNmUtNDFkNC00ZDRlLThmMDUtZDU2YWE4NGI2ZjVmXkEyXkFqcGdeQXVyNjU0OTQ0OTY@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "The Usual Suspects (1995)"}
   {:imDbRatingCount "1313103",
    :rank "41",
    :crew "Christopher Nolan (dir.), Christian Bale, Hugh Jackman",
    :imDbRating "8.5",
    :title "The Prestige",
    :year "2006",
    :id "tt0482571",
    :image
    "https://m.media-amazon.com/images/M/MV5BMjA4NDI0MTIxNF5BMl5BanBnXkFtZTYwNTM0MzY2._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "The Prestige (2006)"}
   {:imDbRatingCount "566132",
    :rank "42",
    :crew "Michael Curtiz (dir.), Humphrey Bogart, Ingrid Bergman",
    :imDbRating "8.5",
    :title "Casablanca",
    :year "1942",
    :id "tt0034583",
    :image
    "https://m.media-amazon.com/images/M/MV5BY2IzZGY2YmEtYzljNS00NTM5LTgwMzUtMzM1NjQ4NGI0OTk0XkEyXkFqcGdeQXVyNDYyMDk5MTU@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Casablanca (1942)"}
   {:imDbRatingCount "834381",
    :rank "43",
    :crew "Damien Chazelle (dir.), Miles Teller, J.K. Simmons",
    :imDbRating "8.5",
    :title "Whiplash",
    :year "2014",
    :id "tt2582802",
    :image
    "https://m.media-amazon.com/images/M/MV5BOTA5NDZlZGUtMjAxOS00YTRkLTkwYmMtYWQ0NWEwZDZiNjEzXkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Whiplash (2014)"}
   {:imDbRatingCount "844587",
    :rank "44",
    :crew "Olivier Nakache (dir.), François Cluzet, Omar Sy",
    :imDbRating "8.5",
    :title "The Intouchables",
    :year "2011",
    :id "tt1675434",
    :image
    "https://m.media-amazon.com/images/M/MV5BMTYxNDA3MDQwNl5BMl5BanBnXkFtZTcwNTU4Mzc1Nw@@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "The Intouchables (2011)"}
   {:imDbRatingCount "272787",
    :rank "45",
    :crew "Isao Takahata (dir.), Tsutomu Tatsumi, Ayano Shiraishi",
    :imDbRating "8.5",
    :title "Grave of the Fireflies",
    :year "1988",
    :id "tt0095327",
    :image
    "https://m.media-amazon.com/images/M/MV5BZmY2NjUzNDQtNTgxNC00M2Q4LTljOWQtMjNjNDBjNWUxNmJlXkEyXkFqcGdeQXVyNTA4NzY1MzY@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Grave of the Fireflies (1988)"}
   {:imDbRatingCount "55894",
    :rank "46",
    :crew "Masaki Kobayashi (dir.), Tatsuya Nakadai, Akira Ishihama",
    :imDbRating "8.5",
    :title "Harakiri",
    :year "1962",
    :id "tt0056058",
    :image
    "https://m.media-amazon.com/images/M/MV5BYjBmYTQ1NjItZWU5MS00YjI0LTg2OTYtYmFkN2JkMmNiNWVkXkEyXkFqcGdeQXVyMTMxMTY0OTQ@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Harakiri (1962)"}
   {:imDbRatingCount "240420",
    :rank "47",
    :crew "Charles Chaplin (dir.), Charles Chaplin, Paulette Goddard",
    :imDbRating "8.4",
    :title "Modern Times",
    :year "1936",
    :id "tt0027977",
    :image
    "https://m.media-amazon.com/images/M/MV5BYjJiZjMzYzktNjU0NS00OTkxLWEwYzItYzdhYWJjN2QzMTRlL2ltYWdlL2ltYWdlXkEyXkFqcGdeQXVyNjU0OTQ0OTY@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Modern Times (1936)"}
   {:imDbRatingCount "326928",
    :rank "48",
    :crew "Sergio Leone (dir.), Henry Fonda, Charles Bronson",
    :imDbRating "8.4",
    :title "Once Upon a Time in the West",
    :year "1968",
    :id "tt0064116",
    :image
    "https://m.media-amazon.com/images/M/MV5BODQ3NDExOGYtMzI3Mi00NWRlLTkwNjAtNjc4MDgzZGJiZTA1XkEyXkFqcGdeQXVyMjUzOTY1NTc@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Once Upon a Time in the West (1968)"}
   {:imDbRatingCount "486646",
    :rank "49",
    :crew "Alfred Hitchcock (dir.), James Stewart, Grace Kelly",
    :imDbRating "8.4",
    :title "Rear Window",
    :year "1954",
    :id "tt0047396",
    :image
    "https://m.media-amazon.com/images/M/MV5BNGUxYWM3M2MtMGM3Mi00ZmRiLWE0NGQtZjE5ODI2OTJhNTU0XkEyXkFqcGdeQXVyMTQxNzMzNDI@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Rear Window (1954)"}
   {:imDbRatingCount "868514",
    :rank "50",
    :crew "Ridley Scott (dir.), Sigourney Weaver, Tom Skerritt",
    :imDbRating "8.4",
    :title "Alien",
    :year "1979",
    :id "tt0078748",
    :image
    "https://m.media-amazon.com/images/M/MV5BOGQzZTBjMjQtOTVmMS00NGE5LWEyYmMtOGQ1ZGZjNmRkYjFhXkEyXkFqcGdeQXVyMjUzOTY1NTc@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Alien (1979)"}
   {:imDbRatingCount "183631",
    :rank "51",
    :crew "Charles Chaplin (dir.), Charles Chaplin, Virginia Cherrill",
    :imDbRating "8.4",
    :title "City Lights",
    :year "1931",
    :id "tt0021749",
    :image
    "https://m.media-amazon.com/images/M/MV5BY2I4MmM1N2EtM2YzOS00OWUzLTkzYzctNDc5NDg2N2IyODJmXkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "City Lights (1931)"}
   {:imDbRatingCount "258361",
    :rank "52",
    :crew "Giuseppe Tornatore (dir.), Philippe Noiret, Enzo Cannavale",
    :imDbRating "8.4",
    :title "Cinema Paradiso",
    :year "1988",
    :id "tt0095765",
    :image
    "https://m.media-amazon.com/images/M/MV5BM2FhYjEyYmYtMDI1Yy00YTdlLWI2NWQtYmEzNzAxOGY1NjY2XkEyXkFqcGdeQXVyNTA3NTIyNDg@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Cinema Paradiso (1988)"}
   {:imDbRatingCount "660065",
    :rank "53",
    :crew "Francis Ford Coppola (dir.), Martin Sheen, Marlon Brando",
    :imDbRating "8.4",
    :title "Apocalypse Now",
    :year "1979",
    :id "tt0078788",
    :image
    "https://m.media-amazon.com/images/M/MV5BYmQyNTA1ZGItNjZjMi00NzFlLWEzMWEtNWMwN2Q2MjJhYzEyXkEyXkFqcGdeQXVyMjUzOTY1NTc@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Apocalypse Now (1979)"}
   {:imDbRatingCount "1222731",
    :rank "54",
    :crew "Christopher Nolan (dir.), Guy Pearce, Carrie-Anne Moss",
    :imDbRating "8.4",
    :title "Memento",
    :year "2000",
    :id "tt0209144",
    :image
    "https://m.media-amazon.com/images/M/MV5BZTcyNjk1MjgtOWI3Mi00YzQwLWI5MTktMzY4ZmI2NDAyNzYzXkEyXkFqcGdeQXVyNjU0OTQ0OTY@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Memento (2000)"}
   {:imDbRatingCount "955345",
    :rank "55",
    :crew "Steven Spielberg (dir.), Harrison Ford, Karen Allen",
    :imDbRating "8.4",
    :title "Indiana Jones and the Raiders of the Lost Ark",
    :year "1981",
    :id "tt0082971",
    :image
    "https://m.media-amazon.com/images/M/MV5BNTU2ODkyY2MtMjU1NC00NjE1LWEzYjgtMWQ3MzRhMTE0NDc0XkEyXkFqcGdeQXVyMjM4MzQ4OTQ@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Indiana Jones and the Raiders of the Lost Ark (1981)"}
   {:imDbRatingCount "1523637",
    :rank "56",
    :crew "Quentin Tarantino (dir.), Jamie Foxx, Christoph Waltz",
    :imDbRating "8.4",
    :title "Django Unchained",
    :year "2012",
    :id "tt1853728",
    :image
    "https://m.media-amazon.com/images/M/MV5BMjIyNTQ5NjQ1OV5BMl5BanBnXkFtZTcwODg1MDU4OA@@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Django Unchained (2012)"}
   {:imDbRatingCount "1100921",
    :rank "57",
    :crew "Andrew Stanton (dir.), Ben Burtt, Elissa Knight",
    :imDbRating "8.4",
    :title "WALL·E",
    :year "2008",
    :id "tt0910970",
    :image
    "https://m.media-amazon.com/images/M/MV5BMjExMTg5OTU0NF5BMl5BanBnXkFtZTcwMjMxMzMzMw@@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "WALL·E (2008)"}
   {:imDbRatingCount "386967",
    :rank "58",
    :crew
    "Florian Henckel von Donnersmarck (dir.), Ulrich Mühe, Martina Gedeck",
    :imDbRating "8.4",
    :title "The Lives of Others",
    :year "2006",
    :id "tt0405094",
    :image
    "https://m.media-amazon.com/images/M/MV5BNmQyNmJjM2ItNTQzYi00ZjMxLWFjMDYtZjUyN2YwZDk5YWQ2XkEyXkFqcGdeQXVyMjUzOTY1NTc@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "The Lives of Others (2006)"}
   {:imDbRatingCount "220435",
    :rank "59",
    :crew "Billy Wilder (dir.), William Holden, Gloria Swanson",
    :imDbRating "8.4",
    :title "Sunset Blvd.",
    :year "1950",
    :id "tt0043014",
    :image
    "https://m.media-amazon.com/images/M/MV5BMTU0NTkyNzYwMF5BMl5BanBnXkFtZTgwMDU0NDk5MTI@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Sunset Blvd. (1950)"}
   {:imDbRatingCount "321233",
    :rank "60",
    :crew "Joseph Kosinski (dir.), Tom Cruise, Jennifer Connelly",
    :imDbRating "8.4",
    :title "Top Gun: Maverick",
    :year "2022",
    :id "tt1745960",
    :image
    "https://m.media-amazon.com/images/M/MV5BOWQwOTA1ZDQtNzk3Yi00ZmVmLWFiZGYtNjdjNThiYjJhNzRjXkEyXkFqcGdeQXVyODE5NzE3OTE@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Top Gun: Maverick (2022)"}
   {:imDbRatingCount "195982",
    :rank "61",
    :crew "Stanley Kubrick (dir.), Kirk Douglas, Ralph Meeker",
    :imDbRating "8.4",
    :title "Paths of Glory",
    :year "1957",
    :id "tt0050825",
    :image
    "https://m.media-amazon.com/images/M/MV5BOTI5Nzc0OTMtYzBkMS00NjkxLThmM2UtNjM2ODgxN2M5NjNkXkEyXkFqcGdeQXVyNjQ2MjQ5NzM@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Paths of Glory (1957)"}
   {:imDbRatingCount "1002716",
    :rank "62",
    :crew "Stanley Kubrick (dir.), Jack Nicholson, Shelley Duvall",
    :imDbRating "8.4",
    :title "The Shining",
    :year "1980",
    :id "tt0081505",
    :image
    "https://m.media-amazon.com/images/M/MV5BZWFlYmY2MGEtZjVkYS00YzU4LTg0YjQtYzY1ZGE3NTA5NGQxXkEyXkFqcGdeQXVyMTQxNzMzNDI@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "The Shining (1980)"}
   {:imDbRatingCount "222573",
    :rank "63",
    :crew "Charles Chaplin (dir.), Charles Chaplin, Paulette Goddard",
    :imDbRating "8.4",
    :title "The Great Dictator",
    :year "1940",
    :id "tt0032553",
    :image
    "https://m.media-amazon.com/images/M/MV5BMmExYWJjNTktNGUyZS00ODhmLTkxYzAtNWIzOGEyMGNiMmUwXkEyXkFqcGdeQXVyNjU0OTQ0OTY@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "The Great Dictator (1940)"}
   {:imDbRatingCount "124354",
    :rank "64",
    :crew "Billy Wilder (dir.), Tyrone Power, Marlene Dietrich",
    :imDbRating "8.4",
    :title "Witness for the Prosecution",
    :year "1957",
    :id "tt0051201",
    :image
    "https://m.media-amazon.com/images/M/MV5BNDQwODU5OWYtNDcyNi00MDQ1LThiOGMtZDkwNWJiM2Y3MDg0XkEyXkFqcGdeQXVyMDI2NDg0NQ@@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Witness for the Prosecution (1957)"}
   {:imDbRatingCount "1050007",
    :rank "65",
    :crew "Anthony Russo (dir.), Robert Downey Jr., Chris Hemsworth",
    :imDbRating "8.4",
    :title "Avengers: Infinity War",
    :year "2018",
    :id "tt4154756",
    :image
    "https://m.media-amazon.com/images/M/MV5BMjMxNjY2MDU1OV5BMl5BanBnXkFtZTgwNzY1MTUwNTM@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Avengers: Infinity War (2018)"}
   {:imDbRatingCount "709265",
    :rank "66",
    :crew "James Cameron (dir.), Sigourney Weaver, Michael Biehn",
    :imDbRating "8.3",
    :title "Aliens",
    :year "1986",
    :id "tt0090605",
    :image
    "https://m.media-amazon.com/images/M/MV5BZGU2OGY5ZTYtMWNhYy00NjZiLWI0NjUtZmNhY2JhNDRmODU3XkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Aliens (1986)"}
   {:imDbRatingCount "1142809",
    :rank "67",
    :crew "Sam Mendes (dir.), Kevin Spacey, Annette Bening",
    :imDbRating "8.3",
    :title "American Beauty",
    :year "1999",
    :id "tt0169547",
    :image
    "https://m.media-amazon.com/images/M/MV5BNTBmZWJkNjctNDhiNC00MGE2LWEwOTctZTk5OGVhMWMyNmVhXkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "American Beauty (1999)"}
   {:imDbRatingCount "486431",
    :rank "68",
    :crew "Stanley Kubrick (dir.), Peter Sellers, George C. Scott",
    :imDbRating "8.3",
    :title
    "Dr. Strangelove or: How I Learned to Stop Worrying and Love the Bomb",
    :year "1964",
    :id "tt0057012",
    :image
    "https://m.media-amazon.com/images/M/MV5BZWI3ZTMxNjctMjdlNS00NmUwLWFiM2YtZDUyY2I3N2MxYTE0XkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle
    "Dr. Strangelove or: How I Learned to Stop Worrying and Love the Bomb (1964)"}
   {:imDbRatingCount "511143",
    :rank "69",
    :crew "Bob Persichetti (dir.), Shameik Moore, Jake Johnson",
    :imDbRating "8.3",
    :title "Spider-Man: Into the Spider-Verse",
    :year "2018",
    :id "tt4633694",
    :image
    "https://m.media-amazon.com/images/M/MV5BMjMwNDkxMTgzOF5BMl5BanBnXkFtZTgwNTkwNTQ3NjM@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Spider-Man: Into the Spider-Verse (2018)"}
   {:imDbRatingCount "1679100",
    :rank "70",
    :crew "Christopher Nolan (dir.), Christian Bale, Tom Hardy",
    :imDbRating "8.3",
    :title "The Dark Knight Rises",
    :year "2012",
    :id "tt1345836",
    :image
    "https://m.media-amazon.com/images/M/MV5BMTk4ODQzNDY3Ml5BMl5BanBnXkFtZTcwODA0NTM4Nw@@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "The Dark Knight Rises (2012)"}
   {:imDbRatingCount "570835",
    :rank "71",
    :crew "Park Chan-wook (dir.), Choi Min-sik, Yoo Ji-tae",
    :imDbRating "8.3",
    :title "Oldboy",
    :year "2003",
    :id "tt0364569",
    :image
    "https://m.media-amazon.com/images/M/MV5BMTI3NTQyMzU5M15BMl5BanBnXkFtZTcwMTM2MjgyMQ@@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Oldboy (2003)"}
   {:imDbRatingCount "1234502",
    :rank "72",
    :crew "Todd Phillips (dir.), Joaquin Phoenix, Robert De Niro",
    :imDbRating "8.3",
    :title "Joker",
    :year "2019",
    :id "tt7286456",
    :image
    "https://m.media-amazon.com/images/M/MV5BNGVjNWI4ZGUtNzE0MS00YTJmLWE0ZDctN2ZiYTk2YmI3NTYyXkEyXkFqcGdeQXVyMTkxNjUyNQ@@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Joker (2019)"}
   {:imDbRatingCount "397989",
    :rank "73",
    :crew "Milos Forman (dir.), F. Murray Abraham, Tom Hulce",
    :imDbRating "8.3",
    :title "Amadeus",
    :year "1984",
    :id "tt0086879",
    :image
    "https://m.media-amazon.com/images/M/MV5BNWJlNzUzNGMtYTAwMS00ZjI2LWFmNWQtODcxNWUxODA5YmU1XkEyXkFqcGdeQXVyNTIzOTk5ODM@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Amadeus (1984)"}
   {:imDbRatingCount "1027705",
    :rank "74",
    :crew "Mel Gibson (dir.), Mel Gibson, Sophie Marceau",
    :imDbRating "8.3",
    :title "Braveheart",
    :year "1995",
    :id "tt0112573",
    :image
    "https://m.media-amazon.com/images/M/MV5BMzkzMmU0YTYtOWM3My00YzBmLWI0YzctOGYyNTkwMWE5MTJkXkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Braveheart (1995)"}
   {:imDbRatingCount "980692",
    :rank "75",
    :crew "John Lasseter (dir.), Tom Hanks, Tim Allen",
    :imDbRating "8.3",
    :title "Toy Story",
    :year "1995",
    :id "tt0114709",
    :image
    "https://m.media-amazon.com/images/M/MV5BMDU2ZWJlMjktMTRhMy00ZTA5LWEzNDgtYmNmZTEwZTViZWJkXkEyXkFqcGdeQXVyNDQ2OTk4MzI@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Toy Story (1995)"}
   {:imDbRatingCount "492736",
    :rank "76",
    :crew "Lee Unkrich (dir.), Anthony Gonzalez, Gael García Bernal",
    :imDbRating "8.3",
    :title "Coco",
    :year "2017",
    :id "tt2380307",
    :image
    "https://m.media-amazon.com/images/M/MV5BYjQ5NjM0Y2YtNjZkNC00ZDhkLWJjMWItN2QyNzFkMDE3ZjAxXkEyXkFqcGdeQXVyODIxMzk5NjA@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Coco (2017)"}
   {:imDbRatingCount "1421156",
    :rank "77",
    :crew "Quentin Tarantino (dir.), Brad Pitt, Diane Kruger",
    :imDbRating "8.3",
    :title "Inglourious Basterds",
    :year "2009",
    :id "tt0361748",
    :image
    "https://m.media-amazon.com/images/M/MV5BOTJiNDEzOWYtMTVjOC00ZjlmLWE0NGMtZmE1OWVmZDQ2OWJhXkEyXkFqcGdeQXVyNTIzOTk5ODM@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Inglourious Basterds (2009)"}
   {:imDbRatingCount "249686",
    :rank "78",
    :crew "Wolfgang Petersen (dir.), Jürgen Prochnow, Herbert Grönemeyer",
    :imDbRating "8.3",
    :title "The Boat",
    :year "1981",
    :id "tt0082096",
    :image
    "https://m.media-amazon.com/images/M/MV5BNDBjMWUxNTUtNjZiNi00YzJhLTgzNzUtMTRiY2FkZmMzYTNjXkEyXkFqcGdeQXVyMTUzMDUzNTI3._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "The Boat (1981)"}
   {:imDbRatingCount "389282",
    :rank "79",
    :crew "Hayao Miyazaki (dir.), Yôji Matsuda, Yuriko Ishida",
    :imDbRating "8.3",
    :title "Princess Mononoke",
    :year "1997",
    :id "tt0119698",
    :image
    "https://m.media-amazon.com/images/M/MV5BNGIzY2IzODQtNThmMi00ZDE4LWI5YzAtNzNlZTM1ZjYyYjUyXkEyXkFqcGdeQXVyODEzNjM5OTQ@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Princess Mononoke (1997)"}
   {:imDbRatingCount "1094540",
    :rank "80",
    :crew "Anthony Russo (dir.), Robert Downey Jr., Chris Evans",
    :imDbRating "8.3",
    :title "Avengers: Endgame",
    :year "2019",
    :id "tt4154796",
    :image
    "https://m.media-amazon.com/images/M/MV5BMTc5MDE2ODcwNV5BMl5BanBnXkFtZTgwMzI2NzQ2NzM@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Avengers: Endgame (2019)"}
   {:imDbRatingCount "348619",
    :rank "81",
    :crew "Sergio Leone (dir.), Robert De Niro, James Woods",
    :imDbRating "8.3",
    :title "Once Upon a Time in America",
    :year "1984",
    :id "tt0087843",
    :image
    "https://m.media-amazon.com/images/M/MV5BMGFkNWI4MTMtNGQ0OC00MWVmLTk3MTktOGYxN2Y2YWVkZWE2XkEyXkFqcGdeQXVyNjU0OTQ0OTY@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Once Upon a Time in America (1984)"}
   {:imDbRatingCount "952577",
    :rank "82",
    :crew "Gus Van Sant (dir.), Robin Williams, Matt Damon",
    :imDbRating "8.3",
    :title "Good Will Hunting",
    :year "1997",
    :id "tt0119217",
    :image
    "https://m.media-amazon.com/images/M/MV5BOTI0MzcxMTYtZDVkMy00NjY1LTgyMTYtZmUxN2M3NmQ2NWJhXkEyXkFqcGdeQXVyMTQxNzMzNDI@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Good Will Hunting (1997)"}
   {:imDbRatingCount "260422",
    :rank "83",
    :crew "Makoto Shinkai (dir.), Ryûnosuke Kamiki, Mone Kamishiraishi",
    :imDbRating "8.3",
    :title "Your Name.",
    :year "2016",
    :id "tt5311514",
    :image
    "https://m.media-amazon.com/images/M/MV5BODRmZDVmNzUtZDA4ZC00NjhkLWI2M2UtN2M0ZDIzNDcxYThjL2ltYWdlXkEyXkFqcGdeQXVyNTk0MzMzODA@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Your Name. (2016)"}
   {:imDbRatingCount "831912",
    :rank "84",
    :crew "Darren Aronofsky (dir.), Ellen Burstyn, Jared Leto",
    :imDbRating "8.3",
    :title "Requiem for a Dream",
    :year "2000",
    :id "tt0180093",
    :image
    "https://m.media-amazon.com/images/M/MV5BOTdiNzJlOWUtNWMwNS00NmFlLWI0YTEtZmI3YjIzZWUyY2Y3XkEyXkFqcGdeQXVyNjU0OTQ0OTY@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Requiem for a Dream (2000)"}
   {:imDbRatingCount "826739",
    :rank "85",
    :crew "Lee Unkrich (dir.), Tom Hanks, Tim Allen",
    :imDbRating "8.3",
    :title "Toy Story 3",
    :year "2010",
    :id "tt0435761",
    :image
    "https://m.media-amazon.com/images/M/MV5BMTgxOTY4Mjc0MF5BMl5BanBnXkFtZTcwNTA4MDQyMw@@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Toy Story 3 (2010)"}
   {:imDbRatingCount "240545",
    :rank "86",
    :crew "Stanley Donen (dir.), Gene Kelly, Donald O'Connor",
    :imDbRating "8.3",
    :title "Singin' in the Rain",
    :year "1952",
    :id "tt0045152",
    :image
    "https://m.media-amazon.com/images/M/MV5BZDRjNGViMjQtOThlMi00MTA3LThkYzQtNzJkYjBkMGE0YzE1XkEyXkFqcGdeQXVyNDYyMDk5MTU@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Singin' in the Rain (1952)"}
   {:imDbRatingCount "394530",
    :rank "87",
    :crew "Rajkumar Hirani (dir.), Aamir Khan, Madhavan",
    :imDbRating "8.3",
    :title "3 Idiots",
    :year "2009",
    :id "tt1187043",
    :image
    "https://m.media-amazon.com/images/M/MV5BNTkyOGVjMGEtNmQzZi00NzFlLTlhOWQtODYyMDc2ZGJmYzFhXkEyXkFqcGdeQXVyNjU0OTQ0OTY@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "3 Idiots (2009)"}
   {:imDbRatingCount "1039906",
    :rank "88",
    :crew "Richard Marquand (dir.), Mark Hamill, Harrison Ford",
    :imDbRating "8.3",
    :title "Star Wars: Episode VI - Return of the Jedi",
    :year "1983",
    :id "tt0086190",
    :image
    "https://m.media-amazon.com/images/M/MV5BOWZlMjFiYzgtMTUzNC00Y2IzLTk1NTMtZmNhMTczNTk0ODk1XkEyXkFqcGdeQXVyNTAyODkwOQ@@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Star Wars: Episode VI - Return of the Jedi (1983)"}
   {:imDbRatingCount "44363",
    :rank "89",
    :crew "Akira Kurosawa (dir.), Toshirô Mifune, Yutaka Sada",
    :imDbRating "8.3",
    :title "High and Low",
    :year "1963",
    :id "tt0057565",
    :image
    "https://m.media-amazon.com/images/M/MV5BZGQ1NWZlYjctNDJmOS00MmU2LTg1ODItNmZiM2ZkNzJhNDI0XkEyXkFqcGdeQXVyNjc1NTYyMjg@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "High and Low (1963)"}
   {:imDbRatingCount "660816",
    :rank "90",
    :crew "Stanley Kubrick (dir.), Keir Dullea, Gary Lockwood",
    :imDbRating "8.3",
    :title "2001: A Space Odyssey",
    :year "1968",
    :id "tt0062622",
    :image
    "https://m.media-amazon.com/images/M/MV5BMmNlYzRiNDctZWNhMi00MzI4LThkZTctMTUzMmZkMmFmNThmXkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "2001: A Space Odyssey (1968)"}
   {:imDbRatingCount "994281",
    :rank "91",
    :crew "Michel Gondry (dir.), Jim Carrey, Kate Winslet",
    :imDbRating "8.3",
    :title "Eternal Sunshine of the Spotless Mind",
    :year "2004",
    :id "tt0338013",
    :image
    "https://m.media-amazon.com/images/M/MV5BMTY4NzcwODg3Nl5BMl5BanBnXkFtZTcwNTEwOTMyMw@@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Eternal Sunshine of the Spotless Mind (2004)"}
   {:imDbRatingCount "1004295",
    :rank "92",
    :crew "Quentin Tarantino (dir.), Harvey Keitel, Tim Roth",
    :imDbRating "8.3",
    :title "Reservoir Dogs",
    :year "1992",
    :id "tt0105236",
    :image
    "https://m.media-amazon.com/images/M/MV5BZmExNmEwYWItYmQzOS00YjA5LTk2MjktZjEyZDE1Y2QxNjA1XkEyXkFqcGdeQXVyMTQxNzMzNDI@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Reservoir Dogs (1992)"}
   {:imDbRatingCount "87696",
    :rank "93",
    :crew "Nadine Labaki (dir.), Zain Al Rafeea, Yordanos Shiferaw",
    :imDbRating "8.3",
    :title "Capernaum",
    :year "2018",
    :id "tt8267604",
    :image
    "https://m.media-amazon.com/images/M/MV5BY2Y3OWNkMTctYzNjYS00NWVkLTg4OWEtY2YxN2I3NDhlYzE0XkEyXkFqcGdeQXVyMTI3ODAyMzE2._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Capernaum (2018)"}
   {:imDbRatingCount "291531",
    :rank "94",
    :crew "David Lean (dir.), Peter O'Toole, Alec Guinness",
    :imDbRating "8.3",
    :title "Lawrence of Arabia",
    :year "1962",
    :id "tt0056172",
    :image
    "https://m.media-amazon.com/images/M/MV5BYWY5ZjhjNGYtZmI2Ny00ODM0LWFkNzgtZmI1YzA2N2MxMzA0XkEyXkFqcGdeQXVyNjUwNzk3NDc@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Lawrence of Arabia (1962)"}
   {:imDbRatingCount "438942",
    :rank "95",
    :crew "Orson Welles (dir.), Orson Welles, Joseph Cotten",
    :imDbRating "8.3",
    :title "Citizen Kane",
    :year "1941",
    :id "tt0033467",
    :image
    "https://m.media-amazon.com/images/M/MV5BYjBiOTYxZWItMzdiZi00NjlkLWIzZTYtYmFhZjhiMTljOTdkXkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Citizen Kane (1941)"}
   {:imDbRatingCount "325348",
    :rank "96",
    :crew "Thomas Vinterberg (dir.), Mads Mikkelsen, Thomas Bo Larsen",
    :imDbRating "8.3",
    :title "The Hunt",
    :year "2012",
    :id "tt2106476",
    :image
    "https://m.media-amazon.com/images/M/MV5BMTg2NDg3ODg4NF5BMl5BanBnXkFtZTcwNzk3NTc3Nw@@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "The Hunt (2012)"}
   {:imDbRatingCount "157052",
    :rank "97",
    :crew "Fritz Lang (dir.), Peter Lorre, Ellen Widmann",
    :imDbRating "8.3",
    :title "M",
    :year "1931",
    :id "tt0022100",
    :image
    "https://m.media-amazon.com/images/M/MV5BODA4ODk3OTEzMF5BMl5BanBnXkFtZTgwMTQ2ODMwMzE@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "M (1931)"}
   {:imDbRatingCount "325462",
    :rank "98",
    :crew "Alfred Hitchcock (dir.), Cary Grant, Eva Marie Saint",
    :imDbRating "8.3",
    :title "North by Northwest",
    :year "1959",
    :id "tt0053125",
    :image
    "https://m.media-amazon.com/images/M/MV5BZDA3NDExMTUtMDlhOC00MmQ5LWExZGUtYmI1NGVlZWI4OWNiXkEyXkFqcGdeQXVyNjc1NTYyMjg@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "North by Northwest (1959)"}
   {:imDbRatingCount "77762",
    :rank "99",
    :crew "Elem Klimov (dir.), Aleksey Kravchenko, Olga Mironova",
    :imDbRating "8.2",
    :title "Come and See",
    :year "1985",
    :id "tt0091251",
    :image
    "https://m.media-amazon.com/images/M/MV5BNzU3OTI1MjItYTJiZC00NDI0LWFlNGYtOTQ1OTVhNDgwM2U3XkEyXkFqcGdeQXVyNTc2MDU0NDE@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Come and See (1985)"}
   {:imDbRatingCount "398968",
    :rank "100",
    :crew "Alfred Hitchcock (dir.), James Stewart, Kim Novak",
    :imDbRating "8.2",
    :title "Vertigo",
    :year "1958",
    :id "tt0052357",
    :image
    "https://m.media-amazon.com/images/M/MV5BYTE4ODEwZDUtNDFjOC00NjAxLWEzYTQtYTI1NGVmZmFlNjdiL2ltYWdlL2ltYWdlXkEyXkFqcGdeQXVyNjc1NTYyMjg@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Vertigo (1958)"}
   {:imDbRatingCount "750522",
    :rank "101",
    :crew "Jean-Pierre Jeunet (dir.), Audrey Tautou, Mathieu Kassovitz",
    :imDbRating "8.2",
    :title "Amélie",
    :year "2001",
    :id "tt0211915",
    :image
    "https://m.media-amazon.com/images/M/MV5BNDg4NjM1YjMtYmNhZC00MjM0LWFiZmYtNGY1YjA3MzZmODc5XkEyXkFqcGdeQXVyNDk3NzU2MTQ@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Amélie (2001)"}
   {:imDbRatingCount "820130",
    :rank "102",
    :crew "Stanley Kubrick (dir.), Malcolm McDowell, Patrick Magee",
    :imDbRating "8.2",
    :title "A Clockwork Orange",
    :year "1971",
    :id "tt0066921",
    :image
    "https://m.media-amazon.com/images/M/MV5BMTY3MjM1Mzc4N15BMl5BanBnXkFtZTgwODM0NzAxMDE@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "A Clockwork Orange (1971)"}
   {:imDbRatingCount "156383",
    :rank "103",
    :crew "Billy Wilder (dir.), Fred MacMurray, Barbara Stanwyck",
    :imDbRating "8.2",
    :title "Double Indemnity",
    :year "1944",
    :id "tt0036775",
    :image
    "https://m.media-amazon.com/images/M/MV5BOTdlNjgyZGUtOTczYi00MDdhLTljZmMtYTEwZmRiOWFkYjRhXkEyXkFqcGdeQXVyNDY2MTk1ODk@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Double Indemnity (1944)"}
   {:imDbRatingCount "734235",
    :rank "104",
    :crew "Stanley Kubrick (dir.), Matthew Modine, R. Lee Ermey",
    :imDbRating "8.2",
    :title "Full Metal Jacket",
    :year "1987",
    :id "tt0093058",
    :image
    "https://m.media-amazon.com/images/M/MV5BNzkxODk0NjEtYjc4Mi00ZDI0LTgyYjEtYzc1NDkxY2YzYTgyXkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Full Metal Jacket (1987)"}
   {:imDbRatingCount "180419",
    :rank "105",
    :crew "Billy Wilder (dir.), Jack Lemmon, Shirley MacLaine",
    :imDbRating "8.2",
    :title "The Apartment",
    :year "1960",
    :id "tt0053604",
    :image
    "https://m.media-amazon.com/images/M/MV5BNzkwODFjNzItMmMwNi00MTU5LWE2MzktM2M4ZDczZGM1MmViXkEyXkFqcGdeQXVyNDY2MTk1ODk@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "The Apartment (1960)"}
   {:imDbRatingCount "826335",
    :rank "106",
    :crew "Brian De Palma (dir.), Al Pacino, Michelle Pfeiffer",
    :imDbRating "8.2",
    :title "Scarface",
    :year "1983",
    :id "tt0086250",
    :image
    "https://m.media-amazon.com/images/M/MV5BNjdjNGQ4NDEtNTEwYS00MTgxLTliYzQtYzE2ZDRiZjFhZmNlXkEyXkFqcGdeQXVyNjU0OTQ0OTY@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Scarface (1983)"}
   {:imDbRatingCount "77922",
    :rank "107",
    :crew "Akira Kurosawa (dir.), Takashi Shimura, Nobuo Kaneko",
    :imDbRating "8.2",
    :title "Ikiru",
    :year "1952",
    :id "tt0044741",
    :image
    "https://m.media-amazon.com/images/M/MV5BZTdkN2E5OTYtN2FiMi00YWUwLWEzMGMtZTMzNjY0NjgzYzFiXkEyXkFqcGdeQXVyMTI3ODAyMzE2._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Ikiru (1952)"}
   {:imDbRatingCount "260259",
    :rank "108",
    :crew "George Roy Hill (dir.), Paul Newman, Robert Redford",
    :imDbRating "8.2",
    :title "The Sting",
    :year "1973",
    :id "tt0070735",
    :image
    "https://m.media-amazon.com/images/M/MV5BNGU3NjQ4YTMtZGJjOS00YTQ3LThmNmItMTI5MDE2ODI3NzY3XkEyXkFqcGdeQXVyMjUzOTY1NTc@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "The Sting (1973)"}
   {:imDbRatingCount "314727",
    :rank "109",
    :crew "Robert Mulligan (dir.), Gregory Peck, John Megna",
    :imDbRating "8.2",
    :title "To Kill a Mockingbird",
    :year "1962",
    :id "tt0056592",
    :image
    "https://m.media-amazon.com/images/M/MV5BNmVmYzcwNzMtMWM1NS00MWIyLThlMDEtYzUwZDgzODE1NmE2XkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "To Kill a Mockingbird (1962)"}
   {:imDbRatingCount "815794",
    :rank "110",
    :crew "Martin Scorsese (dir.), Robert De Niro, Jodie Foster",
    :imDbRating "8.2",
    :title "Taxi Driver",
    :year "1976",
    :id "tt0075314",
    :image
    "https://m.media-amazon.com/images/M/MV5BM2M1MmVhNDgtNmI0YS00ZDNmLTkyNjctNTJiYTQ2N2NmYzc2XkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Taxi Driver (1976)"}
   {:imDbRatingCount "646403",
    :rank "111",
    :crew "Michael Mann (dir.), Al Pacino, Robert De Niro",
    :imDbRating "8.2",
    :title "Heat",
    :year "1995",
    :id "tt0113277",
    :image
    "https://m.media-amazon.com/images/M/MV5BYjZjNTJlZGUtZTE1Ny00ZDc4LTgwYjUtMzk0NDgwYzZjYTk1XkEyXkFqcGdeQXVyNjU0OTQ0OTY@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Heat (1995)"}
   {:imDbRatingCount "1030173",
    :rank "112",
    :crew "Pete Docter (dir.), Edward Asner, Jordan Nagai",
    :imDbRating "8.2",
    :title "Up",
    :year "2009",
    :id "tt1049413",
    :image
    "https://m.media-amazon.com/images/M/MV5BMTk3NDE2NzI4NF5BMl5BanBnXkFtZTgwNzE1MzEyMTE@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Up (2009)"}
   {:imDbRatingCount "578376",
    :rank "113",
    :crew "Curtis Hanson (dir.), Kevin Spacey, Russell Crowe",
    :imDbRating "8.2",
    :title "L.A. Confidential",
    :year "1997",
    :id "tt0119488",
    :image
    "https://m.media-amazon.com/images/M/MV5BMDQ2YzEyZGItYWRhOS00MjBmLTkzMDUtMTdjYzkyMmQxZTJlXkEyXkFqcGdeQXVyNjU0OTQ0OTY@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "L.A. Confidential (1997)"}
   {:imDbRatingCount "173343",
    :rank "114",
    :crew "Fritz Lang (dir.), Brigitte Helm, Alfred Abel",
    :imDbRating "8.2",
    :title "Metropolis",
    :year "1927",
    :id "tt0017136",
    :image
    "https://m.media-amazon.com/images/M/MV5BMTg5YWIyMWUtZDY5My00Zjc1LTljOTctYmI0MWRmY2M2NmRkXkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Metropolis (1927)"}
   {:imDbRatingCount "175569",
    :rank "115",
    :crew "Denis Villeneuve (dir.), Lubna Azabal, Mélissa Désormeaux-Poulin",
    :imDbRating "8.2",
    :title "Incendies",
    :year "2010",
    :id "tt1255953",
    :image
    "https://m.media-amazon.com/images/M/MV5BMWE3MGYzZjktY2Q5Mi00Y2NiLWIyYWUtMmIyNzA3YmZlMGFhXkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Incendies (2010)"}
   {:imDbRatingCount "243892",
    :rank "116",
    :crew "Asghar Farhadi (dir.), Payman Maadi, Leila Hatami",
    :imDbRating "8.2",
    :title "A Separation",
    :year "2011",
    :id "tt1832382",
    :image
    "https://m.media-amazon.com/images/M/MV5BN2JmMjViMjMtZTM5Mi00ZGZkLTk5YzctZDg5MjFjZDE4NjNkXkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "A Separation (2011)"}
   {:imDbRatingCount "866982",
    :rank "117",
    :crew "John McTiernan (dir.), Bruce Willis, Alan Rickman",
    :imDbRating "8.2",
    :title "Die Hard",
    :year "1988",
    :id "tt0095016",
    :image
    "https://m.media-amazon.com/images/M/MV5BZjRlNDUxZjAtOGQ4OC00OTNlLTgxNmQtYTBmMDgwZmNmNjkxXkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Die Hard (1988)"}
   {:imDbRatingCount "846798",
    :rank "118",
    :crew "Guy Ritchie (dir.), Jason Statham, Brad Pitt",
    :imDbRating "8.2",
    :title "Snatch",
    :year "2000",
    :id "tt0208092",
    :image
    "https://m.media-amazon.com/images/M/MV5BMTA2NDYxOGYtYjU1Mi00Y2QzLTgxMTQtMWI1MGI0ZGQ5MmU4XkEyXkFqcGdeQXVyNDk3NzU2MTQ@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Snatch (2000)"}
   {:imDbRatingCount "747137",
    :rank "119",
    :crew "Steven Spielberg (dir.), Harrison Ford, Sean Connery",
    :imDbRating "8.2",
    :title "Indiana Jones and the Last Crusade",
    :year "1989",
    :id "tt0097576",
    :image
    "https://m.media-amazon.com/images/M/MV5BY2Q0ODg4ZmItNDZiYi00ZWY5LTg2NzctNmYwZjA5OThmNzE1XkEyXkFqcGdeQXVyMjM4MzQ4OTQ@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Indiana Jones and the Last Crusade (1989)"}
   {:imDbRatingCount "162609",
    :rank "120",
    :crew "Vittorio De Sica (dir.), Lamberto Maggiorani, Enzo Staiola",
    :imDbRating "8.2",
    :title "Bicycle Thieves",
    :year "1948",
    :id "tt0040522",
    :image
    "https://m.media-amazon.com/images/M/MV5BNmI1ODdjODctMDlmMC00ZWViLWI5MzYtYzRhNDdjYmM3MzFjXkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Bicycle Thieves (1948)"}
   {:imDbRatingCount "91670",
    :rank "121",
    :crew "Thomas Kail (dir.), Lin-Manuel Miranda, Phillipa Soo",
    :imDbRating "8.2",
    :title "Hamilton",
    :year "2020",
    :id "tt8503618",
    :image
    "https://m.media-amazon.com/images/M/MV5BNjViNWRjYWEtZTI0NC00N2E3LTk0NGQtMjY4NTM3OGNkZjY0XkEyXkFqcGdeQXVyMjUxMTY3ODM@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Hamilton (2020)"}
   {:imDbRatingCount "569792",
    :rank "122",
    :crew "Sam Mendes (dir.), Dean-Charles Chapman, George MacKay",
    :imDbRating "8.2",
    :title "1917",
    :year "2019",
    :id "tt8579674",
    :image
    "https://m.media-amazon.com/images/M/MV5BOTdmNTFjNDEtNzg0My00ZjkxLTg1ZDAtZTdkMDc2ZmFiNWQ1XkEyXkFqcGdeQXVyNTAzNzgwNTg@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "1917 (2019)"}
   {:imDbRatingCount "191793",
    :rank "123",
    :crew "Aamir Khan (dir.), Darsheel Safary, Aamir Khan",
    :imDbRating "8.2",
    :title "Like Stars on Earth",
    :year "2007",
    :id "tt0986264",
    :image
    "https://m.media-amazon.com/images/M/MV5BMDhjZWViN2MtNzgxOS00NmI4LThiZDQtZDI3MzM4MDE4NTc0XkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Like Stars on Earth (2007)"}
   {:imDbRatingCount "353650",
    :rank "124",
    :crew "Oliver Hirschbiegel (dir.), Bruno Ganz, Alexandra Maria Lara",
    :imDbRating "8.2",
    :title "Downfall",
    :year "2004",
    :id "tt0363163",
    :image
    "https://m.media-amazon.com/images/M/MV5BMTU0NTU5NTAyMl5BMl5BanBnXkFtZTYwNzYwMDg2._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Downfall (2004)"}
   {:imDbRatingCount "254922",
    :rank "125",
    :crew "Sergio Leone (dir.), Clint Eastwood, Lee Van Cleef",
    :imDbRating "8.2",
    :title "For a Few Dollars More",
    :year "1965",
    :id "tt0059578",
    :image
    "https://m.media-amazon.com/images/M/MV5BMzJlZTNkYjQtMTE1OS00YTJlLTgxNjItYzg4NTllODdkMzBiXkEyXkFqcGdeQXVyMjUzOTY1NTc@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "For a Few Dollars More (1965)"}
   {:imDbRatingCount "1448984",
    :rank "126",
    :crew "Christopher Nolan (dir.), Christian Bale, Michael Caine",
    :imDbRating "8.2",
    :title "Batman Begins",
    :year "2005",
    :id "tt0372784",
    :image
    "https://m.media-amazon.com/images/M/MV5BOTY4YjI2N2MtYmFlMC00ZjcyLTg3YjEtMDQyM2ZjYzQ5YWFkXkEyXkFqcGdeQXVyMTQxNzMzNDI@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Batman Begins (2005)"}
   {:imDbRatingCount "188267",
    :rank "127",
    :crew "Nitesh Tiwari (dir.), Aamir Khan, Sakshi Tanwar",
    :imDbRating "8.2",
    :title "Dangal",
    :year "2016",
    :id "tt5074352",
    :image
    "https://m.media-amazon.com/images/M/MV5BMTQ4MzQzMzM2Nl5BMl5BanBnXkFtZTgwMTQ1NzU3MDI@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Dangal (2016)"}
   {:imDbRatingCount "125938",
    :rank "128",
    :crew "Charles Chaplin (dir.), Charles Chaplin, Edna Purviance",
    :imDbRating "8.2",
    :title "The Kid",
    :year "1921",
    :id "tt0012349",
    :image
    "https://m.media-amazon.com/images/M/MV5BZjhhMThhNDItNTY2MC00MmU1LTliNDEtNDdhZjdlNTY5ZDQ1XkEyXkFqcGdeQXVyNjc1NTYyMjg@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "The Kid (1921)"}
   {:imDbRatingCount "265390",
    :rank "129",
    :crew "Billy Wilder (dir.), Marilyn Monroe, Tony Curtis",
    :imDbRating "8.2",
    :title "Some Like It Hot",
    :year "1959",
    :id "tt0053291",
    :image
    "https://m.media-amazon.com/images/M/MV5BNzAyOGIxYjAtMGY2NC00ZTgyLWIwMWEtYzY0OWQ4NDFjOTc5XkEyXkFqcGdeQXVyNjU0OTQ0OTY@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Some Like It Hot (1959)"}
   {:imDbRatingCount "130923",
    :rank "130",
    :crew "Joseph L. Mankiewicz (dir.), Bette Davis, Anne Baxter",
    :imDbRating "8.2",
    :title "All About Eve",
    :year "1950",
    :id "tt0042192",
    :image
    "https://m.media-amazon.com/images/M/MV5BMTY2MTAzODI5NV5BMl5BanBnXkFtZTgwMjM4NzQ0MjE@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "All About Eve (1950)"}
   {:imDbRatingCount "145517",
    :rank "131",
    :crew "Florian Zeller (dir.), Anthony Hopkins, Olivia Colman",
    :imDbRating "8.2",
    :title "The Father",
    :year "2020",
    :id "tt10272386",
    :image
    "https://m.media-amazon.com/images/M/MV5BZGJhNWRiOWQtMjI4OS00ZjcxLTgwMTAtMzQ2ODkxY2JkOTVlXkEyXkFqcGdeQXVyMTkxNjUyNQ@@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "The Father (2020)"}
   {:imDbRatingCount "477850",
    :rank "132",
    :crew "Peter Farrelly (dir.), Viggo Mortensen, Mahershala Ali",
    :imDbRating "8.2",
    :title "Green Book",
    :year "2018",
    :id "tt6966692",
    :image
    "https://m.media-amazon.com/images/M/MV5BYzIzYmJlYTYtNGNiYy00N2EwLTk4ZjItMGYyZTJiOTVkM2RlXkEyXkFqcGdeQXVyODY1NDk1NjE@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Green Book (2018)"}
   {:imDbRatingCount "1373974",
    :rank "133",
    :crew "Martin Scorsese (dir.), Leonardo DiCaprio, Jonah Hill",
    :imDbRating "8.2",
    :title "The Wolf of Wall Street",
    :year "2013",
    :id "tt0993846",
    :image
    "https://m.media-amazon.com/images/M/MV5BMjIxMjgxNTk0MF5BMl5BanBnXkFtZTgwNjIyOTg2MDE@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "The Wolf of Wall Street (2013)"}
   {:imDbRatingCount "713134",
    :rank "134",
    :crew "Jon Watts (dir.), Tom Holland, Zendaya",
    :imDbRating "8.2",
    :title "Spider-Man: No Way Home",
    :year "2021",
    :id "tt10872600",
    :image
    "https://m.media-amazon.com/images/M/MV5BZWMyYzFjYTYtNTRjYi00OGExLWE2YzgtOGRmYjAxZTU3NzBiXkEyXkFqcGdeQXVyMzQ0MzA0NTM@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Spider-Man: No Way Home (2021)"}
   {:imDbRatingCount "77374",
    :rank "135",
    :crew "Stanley Kramer (dir.), Spencer Tracy, Burt Lancaster",
    :imDbRating "8.2",
    :title "Judgment at Nuremberg",
    :year "1961",
    :id "tt0055031",
    :image
    "https://m.media-amazon.com/images/M/MV5BNDc2ODQ5NTE2MV5BMl5BanBnXkFtZTcwODExMjUyNA@@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Judgment at Nuremberg (1961)"}
   {:imDbRatingCount "124938",
    :rank "136",
    :crew "Akira Kurosawa (dir.), Tatsuya Nakadai, Akira Terao",
    :imDbRating "8.2",
    :title "Ran",
    :year "1985",
    :id "tt0089881",
    :image
    "https://m.media-amazon.com/images/M/MV5BMmU1NGYwZWYtOWExNi00ZTEyLTgwMmUtM2ZlMDVjNWM4YjVlXkEyXkFqcGdeQXVyMjUzOTY1NTc@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Ran (1985)"}
   {:imDbRatingCount "513772",
    :rank "137",
    :crew "Martin Scorsese (dir.), Robert De Niro, Sharon Stone",
    :imDbRating "8.2",
    :title "Casino",
    :year "1995",
    :id "tt0112641",
    :image
    "https://m.media-amazon.com/images/M/MV5BMTcxOWYzNDYtYmM4YS00N2NkLTk0NTAtNjg1ODgwZjAxYzI3XkEyXkFqcGdeQXVyNTA4NzY1MzY@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Casino (1995)"}
   {:imDbRatingCount "409006",
    :rank "138",
    :crew "Clint Eastwood (dir.), Clint Eastwood, Gene Hackman",
    :imDbRating "8.2",
    :title "Unforgiven",
    :year "1992",
    :id "tt0105695",
    :image
    "https://m.media-amazon.com/images/M/MV5BODM3YWY4NmQtN2Y3Ni00OTg0LWFhZGQtZWE3ZWY4MTJlOWU4XkEyXkFqcGdeQXVyNjU0OTQ0OTY@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Unforgiven (1992)"}
   {:imDbRatingCount "663002",
    :rank "139",
    :crew "Guillermo del Toro (dir.), Ivana Baquero, Ariadna Gil",
    :imDbRating "8.2",
    :title "Pan's Labyrinth",
    :year "2006",
    :id "tt0457430",
    :image
    "https://m.media-amazon.com/images/M/MV5BYzFjMThiMGItOWRlMC00MDI4LThmOGUtYTNlZGZiYWI1YjMyXkEyXkFqcGdeQXVyMjUzOTY1NTc@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Pan's Labyrinth (2006)"}
   {:imDbRatingCount "579301",
    :rank "140",
    :crew "Paul Thomas Anderson (dir.), Daniel Day-Lewis, Paul Dano",
    :imDbRating "8.2",
    :title "There Will Be Blood",
    :year "2007",
    :id "tt0469494",
    :image
    "https://m.media-amazon.com/images/M/MV5BMjAxODQ4MDU5NV5BMl5BanBnXkFtZTcwMDU4MjU1MQ@@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "There Will Be Blood (2007)"}
   {:imDbRatingCount "1058923",
    :rank "141",
    :crew "Peter Weir (dir.), Jim Carrey, Ed Harris",
    :imDbRating "8.2",
    :title "The Truman Show",
    :year "1998",
    :id "tt0120382",
    :image
    "https://m.media-amazon.com/images/M/MV5BMDIzODcyY2EtMmY2MC00ZWVlLTgwMzAtMjQwOWUyNmJjNTYyXkEyXkFqcGdeQXVyNDk3NzU2MTQ@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "The Truman Show (1998)"}
   {:imDbRatingCount "981111",
    :rank "142",
    :crew "M. Night Shyamalan (dir.), Bruce Willis, Haley Joel Osment",
    :imDbRating "8.2",
    :title "The Sixth Sense",
    :year "1999",
    :id "tt0167404",
    :image
    "https://m.media-amazon.com/images/M/MV5BMWM4NTFhYjctNzUyNi00NGMwLTk3NTYtMDIyNTZmMzRlYmQyXkEyXkFqcGdeQXVyMTAwMzUyOTc@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "The Sixth Sense (1999)"}
   {:imDbRatingCount "922539",
    :rank "143",
    :crew "Ron Howard (dir.), Russell Crowe, Ed Harris",
    :imDbRating "8.2",
    :title "A Beautiful Mind",
    :year "2001",
    :id "tt0268978",
    :image
    "https://m.media-amazon.com/images/M/MV5BMzcwYWFkYzktZjAzNC00OGY1LWI4YTgtNzc5MzVjMDVmNjY0XkEyXkFqcGdeQXVyMTQxNzMzNDI@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "A Beautiful Mind (2001)"}
   {:imDbRatingCount "537377",
    :rank "144",
    :crew "Terry Gilliam (dir.), Graham Chapman, John Cleese",
    :imDbRating "8.2",
    :title "Monty Python and the Holy Grail",
    :year "1975",
    :id "tt0071853",
    :image
    "https://m.media-amazon.com/images/M/MV5BN2IyNTE4YzUtZWU0Mi00MGIwLTgyMmQtMzQ4YzQxYWNlYWE2XkEyXkFqcGdeQXVyNjU0OTQ0OTY@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Monty Python and the Holy Grail (1975)"}
   {:imDbRatingCount "122401",
    :rank "145",
    :crew "Akira Kurosawa (dir.), Toshirô Mifune, Eijirô Tôno",
    :imDbRating "8.1",
    :title "Yojimbo",
    :year "1961",
    :id "tt0055630",
    :image
    "https://m.media-amazon.com/images/M/MV5BZThiZjAzZjgtNDU3MC00YThhLThjYWUtZGRkYjc2ZWZlOTVjXkEyXkFqcGdeQXVyNTA4NzY1MzY@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Yojimbo (1961)"}
   {:imDbRatingCount "124514",
    :rank "146",
    :crew "John Huston (dir.), Humphrey Bogart, Walter Huston",
    :imDbRating "8.1",
    :title "The Treasure of the Sierra Madre",
    :year "1948",
    :id "tt0040897",
    :image
    "https://m.media-amazon.com/images/M/MV5BOTJlZWMxYzEtMjlkMS00ODE0LThlM2ItMDI3NGQ2YjhmMzkxXkEyXkFqcGdeQXVyMDI2NDg0NQ@@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "The Treasure of the Sierra Madre (1948)"}
   {:imDbRatingCount "1284618",
    :rank "147",
    :crew "Martin Scorsese (dir.), Leonardo DiCaprio, Emily Mortimer",
    :imDbRating "8.1",
    :title "Shutter Island",
    :year "2010",
    :id "tt1130884",
    :image
    "https://m.media-amazon.com/images/M/MV5BYzhiNDkyNzktNTZmYS00ZTBkLTk2MDAtM2U0YjU1MzgxZjgzXkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Shutter Island (2010)"}
   {:imDbRatingCount "975131",
    :rank "148",
    :crew "Steven Spielberg (dir.), Sam Neill, Laura Dern",
    :imDbRating "8.1",
    :title "Jurassic Park",
    :year "1993",
    :id "tt0107290",
    :image
    "https://m.media-amazon.com/images/M/MV5BMjM2MDgxMDg0Nl5BMl5BanBnXkFtZTgwNTM2OTM5NDE@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Jurassic Park (1993)"}
   {:imDbRatingCount "243309",
    :rank "149",
    :crew "John Sturges (dir.), Steve McQueen, James Garner",
    :imDbRating "8.1",
    :title "The Great Escape",
    :year "1963",
    :id "tt0057115",
    :image
    "https://m.media-amazon.com/images/M/MV5BNzA2NmYxMWUtNzBlMC00MWM2LTkwNmQtYTFlZjQwODNhOWE0XkEyXkFqcGdeQXVyNTIzOTk5ODM@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "The Great Escape (1963)"}
   {:imDbRatingCount "167549",
    :rank "150",
    :crew "Akira Kurosawa (dir.), Toshirô Mifune, Machiko Kyô",
    :imDbRating "8.1",
    :title "Rashomon",
    :year "1950",
    :id "tt0042876",
    :image
    "https://m.media-amazon.com/images/M/MV5BMjEzMzA4NDE2OF5BMl5BanBnXkFtZTcwNTc5MDI2NQ@@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Rashomon (1950)"}
   {:imDbRatingCount "1100087",
    :rank "151",
    :crew "Quentin Tarantino (dir.), Uma Thurman, David Carradine",
    :imDbRating "8.1",
    :title "Kill Bill: Vol. 1",
    :year "2003",
    :id "tt0266697",
    :image
    "https://m.media-amazon.com/images/M/MV5BNzM3NDFhYTAtYmU5Mi00NGRmLTljYjgtMDkyODQ4MjNkMGY2XkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Kill Bill: Vol. 1 (2003)"}
   {:imDbRatingCount "957145",
    :rank "152",
    :crew "Ethan Coen (dir.), Tommy Lee Jones, Javier Bardem",
    :imDbRating "8.1",
    :title "No Country for Old Men",
    :year "2007",
    :id "tt0477348",
    :image
    "https://m.media-amazon.com/images/M/MV5BMjA5Njk3MjM4OV5BMl5BanBnXkFtZTcwMTc5MTE1MQ@@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "No Country for Old Men (2007)"}
   {:imDbRatingCount "1031678",
    :rank "153",
    :crew "Andrew Stanton (dir.), Albert Brooks, Ellen DeGeneres",
    :imDbRating "8.1",
    :title "Finding Nemo",
    :year "2003",
    :id "tt0266543",
    :image
    "https://m.media-amazon.com/images/M/MV5BZTAzNWZlNmUtZDEzYi00ZjA5LWIwYjEtZGM1NWE1MjE4YWRhXkEyXkFqcGdeQXVyNjU0OTQ0OTY@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Finding Nemo (2003)"}
   {:imDbRatingCount "239610",
    :rank "154",
    :crew "David Lynch (dir.), Anthony Hopkins, John Hurt",
    :imDbRating "8.1",
    :title "The Elephant Man",
    :year "1980",
    :id "tt0080678",
    :image
    "https://m.media-amazon.com/images/M/MV5BMDVjNjIwOGItNDE3Ny00OThjLWE0NzQtZTU3YjMzZTZjMzhkXkEyXkFqcGdeQXVyMTQxNzMzNDI@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "The Elephant Man (1980)"}
   {:imDbRatingCount "324159",
    :rank "155",
    :crew "Roman Polanski (dir.), Jack Nicholson, Faye Dunaway",
    :imDbRating "8.1",
    :title "Chinatown",
    :year "1974",
    :id "tt0071315",
    :image
    "https://m.media-amazon.com/images/M/MV5BMjJkMDZhYzItZTFhMi00ZGI4LThlNTAtZDNlYmEwNjFkNDYzXkEyXkFqcGdeQXVyMjUzOTY1NTc@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Chinatown (1974)"}
   {:imDbRatingCount "350966",
    :rank "156",
    :crew "Martin Scorsese (dir.), Robert De Niro, Cathy Moriarty",
    :imDbRating "8.1",
    :title "Raging Bull",
    :year "1980",
    :id "tt0081398",
    :image
    "https://m.media-amazon.com/images/M/MV5BYjRmODkzNDItMTNhNi00YjJlLTg0ZjAtODlhZTM0YzgzYThlXkEyXkFqcGdeQXVyNzQ1ODk3MTQ@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Raging Bull (1980)"}
   {:imDbRatingCount "417715",
    :rank "157",
    :crew "John Carpenter (dir.), Kurt Russell, Wilford Brimley",
    :imDbRating "8.1",
    :title "The Thing",
    :year "1982",
    :id "tt0084787",
    :image
    "https://m.media-amazon.com/images/M/MV5BNGViZWZmM2EtNGYzZi00ZDAyLTk3ODMtNzIyZTBjN2Y1NmM1XkEyXkFqcGdeQXVyNTAyODkwOQ@@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "The Thing (1982)"}
   {:imDbRatingCount "313660",
    :rank "158",
    :crew "Victor Fleming (dir.), Clark Gable, Vivien Leigh",
    :imDbRating "8.1",
    :title "Gone with the Wind",
    :year "1939",
    :id "tt0031381",
    :image
    "https://m.media-amazon.com/images/M/MV5BYjUyZWZkM2UtMzYxYy00ZmQ3LWFmZTQtOGE2YjBkNjA3YWZlXkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Gone with the Wind (1939)"}
   {:imDbRatingCount "1110393",
    :rank "159",
    :crew "James McTeigue (dir.), Hugo Weaving, Natalie Portman",
    :imDbRating "8.1",
    :title "V for Vendetta",
    :year "2005",
    :id "tt0434409",
    :image
    "https://m.media-amazon.com/images/M/MV5BOTI5ODc3NzExNV5BMl5BanBnXkFtZTcwNzYxNzQzMw@@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "V for Vendetta (2005)"}
   {:imDbRatingCount "701723",
    :rank "160",
    :crew "Pete Docter (dir.), Amy Poehler, Bill Hader",
    :imDbRating "8.1",
    :title "Inside Out",
    :year "2015",
    :id "tt2096673",
    :image
    "https://m.media-amazon.com/images/M/MV5BOTgxMDQwMDk0OF5BMl5BanBnXkFtZTgwNjU5OTg2NDE@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Inside Out (2015)"}
   {:imDbRatingCount "577354",
    :rank "161",
    :crew "Guy Ritchie (dir.), Jason Flemyng, Dexter Fletcher",
    :imDbRating "8.1",
    :title "Lock, Stock and Two Smoking Barrels",
    :year "1998",
    :id "tt0120735",
    :image
    "https://m.media-amazon.com/images/M/MV5BMTAyN2JmZmEtNjAyMy00NzYwLThmY2MtYWQ3OGNhNjExMmM4XkEyXkFqcGdeQXVyNDk3NzU2MTQ@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Lock, Stock and Two Smoking Barrels (1998)"}
   {:imDbRatingCount "174803",
    :rank "162",
    :crew "Alfred Hitchcock (dir.), Ray Milland, Grace Kelly",
    :imDbRating "8.1",
    :title "Dial M for Murder",
    :year "1954",
    :id "tt0046912",
    :image
    "https://m.media-amazon.com/images/M/MV5BOWIwODIxYWItZDI4MS00YzhhLWE3MmYtMzlhZDIwOTMzZmE5L2ltYWdlXkEyXkFqcGdeQXVyNjc1NTYyMjg@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Dial M for Murder (1954)"}
   {:imDbRatingCount "208568",
    :rank "163",
    :crew "Juan José Campanella (dir.), Ricardo Darín, Soledad Villamil",
    :imDbRating "8.1",
    :title "The Secret in Their Eyes",
    :year "2009",
    :id "tt1305806",
    :image
    "https://m.media-amazon.com/images/M/MV5BY2FhZGI5M2QtZWFiZS00NjkwLWE4NWQtMzg3ZDZjNjdkYTJiXkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "The Secret in Their Eyes (2009)"}
   {:imDbRatingCount "388423",
    :rank "164",
    :crew "Hayao Miyazaki (dir.), Chieko Baishô, Takuya Kimura",
    :imDbRating "8.1",
    :title "Howl's Moving Castle",
    :year "2004",
    :id "tt0347149",
    :image
    "https://m.media-amazon.com/images/M/MV5BNmM4YTFmMmItMGE3Yy00MmRkLTlmZGEtMzZlOTQzYjk3MzA2XkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Howl's Moving Castle (2004)"}
   {:imDbRatingCount "219636",
    :rank "165",
    :crew "David Lean (dir.), William Holden, Alec Guinness",
    :imDbRating "8.1",
    :title "The Bridge on the River Kwai",
    :year "1957",
    :id "tt0050212",
    :image
    "https://m.media-amazon.com/images/M/MV5BOGY5NmNlMmQtYzRlYy00NGQ5LWFkYjYtNzExZmQyMTg0ZDA0XkEyXkFqcGdeQXVyNDIzMzcwNjc@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "The Bridge on the River Kwai (1957)"}
   {:imDbRatingCount "498493",
    :rank "166",
    :crew "Martin McDonagh (dir.), Frances McDormand, Woody Harrelson",
    :imDbRating "8.1",
    :title "Three Billboards Outside Ebbing, Missouri",
    :year "2017",
    :id "tt5027774",
    :image
    "https://m.media-amazon.com/images/M/MV5BMjI0ODcxNzM1N15BMl5BanBnXkFtZTgwMzIwMTEwNDI@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Three Billboards Outside Ebbing, Missouri (2017)"}
   {:imDbRatingCount "681188",
    :rank "167",
    :crew "Danny Boyle (dir.), Ewan McGregor, Ewen Bremner",
    :imDbRating "8.1",
    :title "Trainspotting",
    :year "1996",
    :id "tt0117951",
    :image
    "https://m.media-amazon.com/images/M/MV5BMzA5Zjc3ZTMtMmU5YS00YTMwLWI4MWUtYTU0YTVmNjVmODZhXkEyXkFqcGdeQXVyNjU0OTQ0OTY@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Trainspotting (1996)"}
   {:imDbRatingCount "468898",
    :rank "168",
    :crew "Gavin O'Connor (dir.), Tom Hardy, Nick Nolte",
    :imDbRating "8.1",
    :title "Warrior",
    :year "2011",
    :id "tt1291584",
    :image
    "https://m.media-amazon.com/images/M/MV5BMTk4ODk5MTMyNV5BMl5BanBnXkFtZTcwMDMyNTg0Ng@@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Warrior (2011)"}
   {:imDbRatingCount "769698",
    :rank "169",
    :crew "Clint Eastwood (dir.), Clint Eastwood, Bee Vang",
    :imDbRating "8.1",
    :title "Gran Torino",
    :year "2008",
    :id "tt1205489",
    :image
    "https://m.media-amazon.com/images/M/MV5BMTc5NTk2OTU1Nl5BMl5BanBnXkFtZTcwMDc3NjAwMg@@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Gran Torino (2008)"}
   {:imDbRatingCount "671848",
    :rank "170",
    :crew "Joel Coen (dir.), William H. Macy, Frances McDormand",
    :imDbRating "8.1",
    :title "Fargo",
    :year "1996",
    :id "tt0116282",
    :image
    "https://m.media-amazon.com/images/M/MV5BNDJiZDgyZjctYmRjMS00ZjdkLTkwMTEtNGU1NDg3NDQ0Yzk1XkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Fargo (1996)"}
   {:imDbRatingCount "695975",
    :rank "171",
    :crew "Denis Villeneuve (dir.), Hugh Jackman, Jake Gyllenhaal",
    :imDbRating "8.1",
    :title "Prisoners",
    :year "2013",
    :id "tt1392214",
    :image
    "https://m.media-amazon.com/images/M/MV5BMTg0NTIzMjQ1NV5BMl5BanBnXkFtZTcwNDc3MzM5OQ@@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Prisoners (2013)"}
   {:imDbRatingCount "334175",
    :rank "172",
    :crew "Hayao Miyazaki (dir.), Hitoshi Takagi, Noriko Hidaka",
    :imDbRating "8.1",
    :title "My Neighbor Totoro",
    :year "1988",
    :id "tt0096283",
    :image
    "https://m.media-amazon.com/images/M/MV5BYzJjMTYyMjQtZDI0My00ZjE2LTkyNGYtOTllNGQxNDMyZjE0XkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "My Neighbor Totoro (1988)"}
   {:imDbRatingCount "682426",
    :rank "173",
    :crew "Clint Eastwood (dir.), Hilary Swank, Clint Eastwood",
    :imDbRating "8.1",
    :title "Million Dollar Baby",
    :year "2004",
    :id "tt0405159",
    :image
    "https://m.media-amazon.com/images/M/MV5BMTkxNzA1NDQxOV5BMl5BanBnXkFtZTcwNTkyMTIzMw@@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Million Dollar Baby (2004)"}
   {:imDbRatingCount "961331",
    :rank "174",
    :crew "Steven Spielberg (dir.), Leonardo DiCaprio, Tom Hanks",
    :imDbRating "8.1",
    :title "Catch Me If You Can",
    :year "2002",
    :id "tt0264464",
    :image
    "https://m.media-amazon.com/images/M/MV5BMTY5MzYzNjc5NV5BMl5BanBnXkFtZTYwNTUyNTc2._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Catch Me If You Can (2002)"}
   {:imDbRatingCount "110909",
    :rank "175",
    :crew "Charles Chaplin (dir.), Charles Chaplin, Mack Swain",
    :imDbRating "8.1",
    :title "The Gold Rush",
    :year "1925",
    :id "tt0015864",
    :image
    "https://m.media-amazon.com/images/M/MV5BZjEyOTE4MzMtNmMzMy00Mzc3LWJlOTQtOGJiNDE0ZmJiOTU4L2ltYWdlXkEyXkFqcGdeQXVyNTAyODkwOQ@@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "The Gold Rush (1925)"}
   {:imDbRatingCount "760179",
    :rank "176",
    :crew "Ridley Scott (dir.), Harrison Ford, Rutger Hauer",
    :imDbRating "8.1",
    :title "Blade Runner",
    :year "1982",
    :id "tt0083658",
    :image
    "https://m.media-amazon.com/images/M/MV5BNzQzMzJhZTEtOWM4NS00MTdhLTg0YjgtMjM4MDRkZjUwZDBlXkEyXkFqcGdeQXVyNjU0OTQ0OTY@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Blade Runner (1982)"}
   {:imDbRatingCount "154503",
    :rank "177",
    :crew "Elia Kazan (dir.), Marlon Brando, Karl Malden",
    :imDbRating "8.1",
    :title "On the Waterfront",
    :year "1954",
    :id "tt0047296",
    :image
    "https://m.media-amazon.com/images/M/MV5BY2I0MWFiZDMtNWQyYy00Njk5LTk3MDktZjZjNTNmZmVkYjkxXkEyXkFqcGdeQXVyNjc1NTYyMjg@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "On the Waterfront (1954)"}
   {:imDbRatingCount "74508",
    :rank "178",
    :crew "Majid Majidi (dir.), Mohammad Amir Naji, Amir Farrokh Hashemian",
    :imDbRating "8.1",
    :title "Children of Heaven",
    :year "1997",
    :id "tt0118849",
    :image
    "https://m.media-amazon.com/images/M/MV5BZTYwZWQ4ZTQtZWU0MS00N2YwLWEzMDItZWFkZWY0MWVjODVhXkEyXkFqcGdeQXVyNjU0OTQ0OTY@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Children of Heaven (1997)"}
   {:imDbRatingCount "171043",
    :rank "179",
    :crew "Carol Reed (dir.), Orson Welles, Joseph Cotten",
    :imDbRating "8.1",
    :title "The Third Man",
    :year "1949",
    :id "tt0041959",
    :image
    "https://m.media-amazon.com/images/M/MV5BYjE2OTdhMWUtOGJlMy00ZDViLWIzZjgtYjZkZGZmMDZjYmEyXkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "The Third Man (1949)"}
   {:imDbRatingCount "238206",
    :rank "180",
    :crew "William Wyler (dir.), Charlton Heston, Jack Hawkins",
    :imDbRating "8.1",
    :title "Ben-Hur",
    :year "1959",
    :id "tt0052618",
    :image
    "https://m.media-amazon.com/images/M/MV5BNjgxY2JiZDYtZmMwOC00ZmJjLWJmODUtMTNmNWNmYWI5ODkwL2ltYWdlL2ltYWdlXkEyXkFqcGdeQXVyNjc1NTYyMjg@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Ben-Hur (1959)"}
   {:imDbRatingCount "187971",
    :rank "181",
    :crew "Dan Kwan (dir.), Michelle Yeoh, Stephanie Hsu",
    :imDbRating "8.1",
    :title "Everything Everywhere All at Once",
    :year "2022",
    :id "tt6710474",
    :image
    "https://m.media-amazon.com/images/M/MV5BYTdiOTIyZTQtNmQ1OS00NjZlLWIyMTgtYzk5Y2M3ZDVmMDk1XkEyXkFqcGdeQXVyMTAzMDg4NzU0._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Everything Everywhere All at Once (2022)"}
   {:imDbRatingCount "304483",
    :rank "182",
    :crew "Richard Linklater (dir.), Ethan Hawke, Julie Delpy",
    :imDbRating "8.1",
    :title "Before Sunrise",
    :year "1995",
    :id "tt0112471",
    :image
    "https://m.media-amazon.com/images/M/MV5BZDdiZTAwYzAtMDI3Ni00OTRjLTkzN2UtMGE3MDMyZmU4NTU4XkEyXkFqcGdeQXVyNjU0OTQ0OTY@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Before Sunrise (1995)"}
   {:imDbRatingCount "694223",
    :rank "183",
    :crew "Steve McQueen (dir.), Chiwetel Ejiofor, Michael Kenneth Williams",
    :imDbRating "8.1",
    :title "12 Years a Slave",
    :year "2013",
    :id "tt2024544",
    :image
    "https://m.media-amazon.com/images/M/MV5BMjExMTEzODkyN15BMl5BanBnXkFtZTcwNTU4NTc4OQ@@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "12 Years a Slave (2013)"}
   {:imDbRatingCount "106956",
    :rank "184",
    :crew "Ingmar Bergman (dir.), Victor Sjöström, Bibi Andersson",
    :imDbRating "8.1",
    :title "Wild Strawberries",
    :year "1957",
    :id "tt0050986",
    :image
    "https://m.media-amazon.com/images/M/MV5BYWQxYzdhMDMtNjAyZC00NzE0LWFjYmQtYjk0YzMyYjA5NzZkXkEyXkFqcGdeQXVyMjUzOTY1NTc@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Wild Strawberries (1957)"}
   {:imDbRatingCount "91082",
    :rank "185",
    :crew "Clyde Bruckman (dir.), Buster Keaton, Marion Mack",
    :imDbRating "8.1",
    :title "The General",
    :year "1926",
    :id "tt0017925",
    :image
    "https://m.media-amazon.com/images/M/MV5BYmRiMDFlYjYtOTMwYy00OGY2LWE0Y2QtYzQxOGNhZmUwNTIxXkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "The General (1926)"}
   {:imDbRatingCount "968048",
    :rank "186",
    :crew "David Fincher (dir.), Ben Affleck, Rosamund Pike",
    :imDbRating "8.1",
    :title "Gone Girl",
    :year "2014",
    :id "tt2267998",
    :image
    "https://m.media-amazon.com/images/M/MV5BMTk0MDQ3MzAzOV5BMl5BanBnXkFtZTgwNzU1NzE3MjE@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Gone Girl (2014)"}
   {:imDbRatingCount "861598",
    :rank "187",
    :crew "David Yates (dir.), Daniel Radcliffe, Emma Watson",
    :imDbRating "8.1",
    :title "Harry Potter and the Deathly Hallows: Part 2",
    :year "2011",
    :id "tt1201607",
    :image
    "https://m.media-amazon.com/images/M/MV5BMGVmMWNiMDktYjQ0Mi00MWIxLTk0N2UtN2ZlYTdkN2IzNDNlXkEyXkFqcGdeQXVyODE5NzE3OTE@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Harry Potter and the Deathly Hallows: Part 2 (2011)"}
   {:imDbRatingCount "337249",
    :rank "188",
    :crew "Michael Cimino (dir.), Robert De Niro, Christopher Walken",
    :imDbRating "8.1",
    :title "The Deer Hunter",
    :year "1978",
    :id "tt0077416",
    :image
    "https://m.media-amazon.com/images/M/MV5BNDhmNTA0ZDMtYjhkNS00NzEzLWIzYTItOGNkMTVmYjE2YmI3XkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "The Deer Hunter (1978)"}
   {:imDbRatingCount "174100",
    :rank "189",
    :crew "Jim Sheridan (dir.), Daniel Day-Lewis, Pete Postlethwaite",
    :imDbRating "8.1",
    :title "In the Name of the Father",
    :year "1993",
    :id "tt0107207",
    :image
    "https://m.media-amazon.com/images/M/MV5BMmYyOTgwYWItYmU3Ny00M2E2LTk0NWMtMDVlNmQ0MWZiMTMxXkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "In the Name of the Father (1993)"}
   {:imDbRatingCount "795745",
    :rank "190",
    :crew "Wes Anderson (dir.), Ralph Fiennes, F. Murray Abraham",
    :imDbRating "8.1",
    :title "The Grand Budapest Hotel",
    :year "2014",
    :id "tt2278388",
    :image
    "https://m.media-amazon.com/images/M/MV5BMzM5NjUxOTEyMl5BMl5BanBnXkFtZTgwNjEyMDM0MDE@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "The Grand Budapest Hotel (2014)"}
   {:imDbRatingCount "166524",
    :rank "191",
    :crew "Stanley Kubrick (dir.), Ryan O'Neal, Marisa Berenson",
    :imDbRating "8.1",
    :title "Barry Lyndon",
    :year "1975",
    :id "tt0072684",
    :image
    "https://m.media-amazon.com/images/M/MV5BNmY0MWY2NDctZDdmMi00MjA1LTk0ZTQtZDMyZTQ1NTNlYzVjXkEyXkFqcGdeQXVyMjUzOTY1NTc@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Barry Lyndon (1975)"}
   {:imDbRatingCount "115421",
    :rank "192",
    :crew "Frank Capra (dir.), James Stewart, Jean Arthur",
    :imDbRating "8.1",
    :title "Mr. Smith Goes to Washington",
    :year "1939",
    :id "tt0031679",
    :image
    "https://m.media-amazon.com/images/M/MV5BZTYwYjYxYzgtMDE1Ni00NzU4LWJlMTEtODQ5YmJmMGJhZjI5L2ltYWdlXkEyXkFqcGdeQXVyMDI2NDg0NQ@@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Mr. Smith Goes to Washington (1939)"}
   {:imDbRatingCount "61006",
    :rank "193",
    :crew "Henri-Georges Clouzot (dir.), Yves Montand, Charles Vanel",
    :imDbRating "8.1",
    :title "The Wages of Fear",
    :year "1953",
    :id "tt0046268",
    :image
    "https://m.media-amazon.com/images/M/MV5BZDdkNzMwZmUtY2Q5MS00ZmM2LWJhYjItYTBjMWY0MGM4MDRjXkEyXkFqcGdeQXVyNTA4NzY1MzY@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "The Wages of Fear (1953)"}
   {:imDbRatingCount "49676",
    :rank "194",
    :crew "Buster Keaton (dir.), Buster Keaton, Kathryn McGuire",
    :imDbRating "8.1",
    :title "Sherlock Jr.",
    :year "1924",
    :id "tt0015324",
    :image
    "https://m.media-amazon.com/images/M/MV5BZWFhOGU5NDctY2Q3YS00Y2VlLWI1NzEtZmIwY2ZiZjY4OTA2XkEyXkFqcGdeQXVyMDI2NDg0NQ@@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Sherlock Jr. (1924)"}
   {:imDbRatingCount "514443",
    :rank "195",
    :crew "Mel Gibson (dir.), Andrew Garfield, Sam Worthington",
    :imDbRating "8.1",
    :title "Hacksaw Ridge",
    :year "2016",
    :id "tt2119532",
    :image
    "https://m.media-amazon.com/images/M/MV5BMjQ1NjM3MTUxNV5BMl5BanBnXkFtZTgwMDc5MTY5OTE@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Hacksaw Ridge (2016)"}
   {:imDbRatingCount "179524",
    :rank "196",
    :crew "Bong Joon Ho (dir.), Song Kang-ho, Kim Sang-kyung",
    :imDbRating "8.1",
    :title "Memories of Murder",
    :year "2003",
    :id "tt0353969",
    :image
    "https://m.media-amazon.com/images/M/MV5BOGViNTg4YTktYTQ2Ni00MTU0LTk2NWUtMTI4OTc1YTM0NzQ2XkEyXkFqcGdeQXVyMDM2NDM2MQ@@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Memories of Murder (2003)"}
   {:imDbRatingCount "146228",
    :rank "197",
    :crew "Sergio Pablos (dir.), Jason Schwartzman, J.K. Simmons",
    :imDbRating "8.1",
    :title "Klaus",
    :year "2019",
    :id "tt4729430",
    :image
    "https://m.media-amazon.com/images/M/MV5BMWYwOThjM2ItZGYxNy00NTQwLWFlZWEtM2MzM2Q5MmY3NDU5XkEyXkFqcGdeQXVyMTkxNjUyNQ@@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Klaus (2019)"}
   {:imDbRatingCount "196636",
    :rank "198",
    :crew "Damián Szifron (dir.), Darío Grandinetti, María Marull",
    :imDbRating "8.1",
    :title "Wild Tales",
    :year "2014",
    :id "tt3011894",
    :image
    "https://m.media-amazon.com/images/M/MV5BNGQzY2Y0MTgtMDA4OC00NjM3LWI0ZGQtNTJlM2UxZDQxZjI0XkEyXkFqcGdeQXVyNDUzOTQ5MjY@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Wild Tales (2014)"}
   {:imDbRatingCount "184067",
    :rank "199",
    :crew "Ingmar Bergman (dir.), Max von Sydow, Gunnar Björnstrand",
    :imDbRating "8.1",
    :title "The Seventh Seal",
    :year "1957",
    :id "tt0050976",
    :image
    "https://m.media-amazon.com/images/M/MV5BOWM3MmE0OGYtOGVlNC00OWE1LTk5ZTAtYmUwMDIwM2ZlNWJiXkEyXkFqcGdeQXVyMjUzOTY1NTc@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "The Seventh Seal (1957)"}
   {:imDbRatingCount "416148",
    :rank "200",
    :crew "Lenny Abrahamson (dir.), Brie Larson, Jacob Tremblay",
    :imDbRating "8.1",
    :title "Room",
    :year "2015",
    :id "tt3170832",
    :image
    "https://m.media-amazon.com/images/M/MV5BMjE4NzgzNzEwMl5BMl5BanBnXkFtZTgwMTMzMDE0NjE@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Room (2015)"}
   {:imDbRatingCount "986174",
    :rank "201",
    :crew "George Miller (dir.), Tom Hardy, Charlize Theron",
    :imDbRating "8.1",
    :title "Mad Max: Fury Road",
    :year "2015",
    :id "tt1392190",
    :image
    "https://m.media-amazon.com/images/M/MV5BN2EwM2I5OWMtMGQyMi00Zjg1LWJkNTctZTdjYTA4OGUwZjMyXkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Mad Max: Fury Road (2015)"}
   {:imDbRatingCount "731436",
    :rank "202",
    :crew "Dean DeBlois (dir.), Jay Baruchel, Gerard Butler",
    :imDbRating "8.1",
    :title "How to Train Your Dragon",
    :year "2010",
    :id "tt0892769",
    :image
    "https://m.media-amazon.com/images/M/MV5BMjA5NDQyMjc2NF5BMl5BanBnXkFtZTcwMjg5ODcyMw@@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "How to Train Your Dragon (2010)"}
   {:imDbRatingCount "800007",
    :rank "203",
    :crew "Joel Coen (dir.), Jeff Bridges, John Goodman",
    :imDbRating "8.1",
    :title "The Big Lebowski",
    :year "1998",
    :id "tt0118715",
    :image
    "https://m.media-amazon.com/images/M/MV5BMTQ0NjUzMDMyOF5BMl5BanBnXkFtZTgwODA1OTU0MDE@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "The Big Lebowski (1998)"}
   {:imDbRatingCount "176693",
    :rank "204",
    :crew "Adam Elliot (dir.), Toni Collette, Philip Seymour Hoffman",
    :imDbRating "8.1",
    :title "Mary and Max",
    :year "2009",
    :id "tt0978762",
    :image
    "https://m.media-amazon.com/images/M/MV5BMDgzYjQwMDMtNGUzYi00MTRmLWIyMGMtNjE1OGZkNzY2YWIzL2ltYWdlXkEyXkFqcGdeQXVyNjU0OTQ0OTY@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Mary and Max (2009)"}
   {:imDbRatingCount "897593",
    :rank "205",
    :crew "Pete Docter (dir.), Billy Crystal, John Goodman",
    :imDbRating "8.1",
    :title "Monsters, Inc.",
    :year "2001",
    :id "tt0198781",
    :image
    "https://m.media-amazon.com/images/M/MV5BMTY1NTI0ODUyOF5BMl5BanBnXkFtZTgwNTEyNjQ0MDE@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Monsters, Inc. (2001)"}
   {:imDbRatingCount "596439",
    :rank "206",
    :crew "Steven Spielberg (dir.), Roy Scheider, Robert Shaw",
    :imDbRating "8.1",
    :title "Jaws",
    :year "1975",
    :id "tt0073195",
    :image
    "https://m.media-amazon.com/images/M/MV5BMmVmODY1MzEtYTMwZC00MzNhLWFkNDMtZjAwM2EwODUxZTA5XkEyXkFqcGdeQXVyNTAyODkwOQ@@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Jaws (1975)"}
   {:imDbRatingCount "482380",
    :rank "207",
    :crew "Peter Weir (dir.), Robin Williams, Robert Sean Leonard",
    :imDbRating "8.1",
    :title "Dead Poets Society",
    :year "1989",
    :id "tt0097165",
    :image
    "https://m.media-amazon.com/images/M/MV5BOGYwYWNjMzgtNGU4ZC00NWQ2LWEwZjUtMzE1Zjc3NjY3YTU1XkEyXkFqcGdeQXVyMTQxNzMzNDI@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Dead Poets Society (1989)"}
   {:imDbRatingCount "61420",
    :rank "208",
    :crew "Yasujirô Ozu (dir.), Chishû Ryû, Chieko Higashiyama",
    :imDbRating "8.1",
    :title "Tokyo Story",
    :year "1953",
    :id "tt0046438",
    :image
    "https://m.media-amazon.com/images/M/MV5BYWQ4ZTRiODktNjAzZC00Nzg1LTk1YWQtNDFmNDI0NmZiNGIwXkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Tokyo Story (1953)"}
   {:imDbRatingCount "54543",
    :rank "209",
    :crew "Carl Theodor Dreyer (dir.), Maria Falconetti, Eugene Silvain",
    :imDbRating "8.1",
    :title "The Passion of Joan of Arc",
    :year "1928",
    :id "tt0019254",
    :image
    "https://m.media-amazon.com/images/M/MV5BNjBjNDJiYTUtOWY0OS00OGVmLTg2YzctMTE0NzVhODM1ZWJmXkEyXkFqcGdeQXVyNjU0OTQ0OTY@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "The Passion of Joan of Arc (1928)"}
   {:imDbRatingCount "354221",
    :rank "210",
    :crew "Terry George (dir.), Don Cheadle, Sophie Okonedo",
    :imDbRating "8.1",
    :title "Hotel Rwanda",
    :year "2004",
    :id "tt0395169",
    :image
    "https://m.media-amazon.com/images/M/MV5BZGJjYmIzZmQtNWE4Yy00ZGVmLWJkZGEtMzUzNmQ4ZWFlMjRhXkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Hotel Rwanda (2004)"}
   {:imDbRatingCount "568872",
    :rank "211",
    :crew "John G. Avildsen (dir.), Sylvester Stallone, Talia Shire",
    :imDbRating "8.0",
    :title "Rocky",
    :year "1976",
    :id "tt0075148",
    :image
    "https://m.media-amazon.com/images/M/MV5BNTBkMjg2MjYtYTZjOS00ODQ0LTg0MDEtM2FiNmJmOGU1NGEwXkEyXkFqcGdeQXVyMjUzOTY1NTc@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Rocky (1976)"}
   {:imDbRatingCount "381464",
    :rank "212",
    :crew "James Mangold (dir.), Matt Damon, Christian Bale",
    :imDbRating "8.0",
    :title "Ford v Ferrari",
    :year "2019",
    :id "tt1950186",
    :image
    "https://m.media-amazon.com/images/M/MV5BM2UwMDVmMDItM2I2Yi00NGZmLTk4ZTUtY2JjNTQ3OGQ5ZjM2XkEyXkFqcGdeQXVyMTA1OTYzOTUx._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Ford v Ferrari (2019)"}
   {:imDbRatingCount "411448",
    :rank "213",
    :crew "Oliver Stone (dir.), Charlie Sheen, Tom Berenger",
    :imDbRating "8.0",
    :title "Platoon",
    :year "1986",
    :id "tt0091763",
    :image
    "https://m.media-amazon.com/images/M/MV5BMzRjZjdlMjQtODVkYS00N2YzLWJlYWYtMGVlN2E5MWEwMWQzXkEyXkFqcGdeQXVyMTQxNzMzNDI@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Platoon (1986)"}
   {:imDbRatingCount "32619",
    :rank "214",
    :crew "Satyajit Ray (dir.), Kanu Bannerjee, Karuna Bannerjee",
    :imDbRating "8.0",
    :title "Pather Panchali",
    :year "1955",
    :id "tt0048473",
    :image
    "https://m.media-amazon.com/images/M/MV5BMmFkNDY5OTktNzY3Yy00OTFlLThhNjktOTRhMmZjZmIxYjAxXkEyXkFqcGdeQXVyNTgyNTA4MjM@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Pather Panchali (1955)"}
   {:imDbRatingCount "399333",
    :rank "215",
    :crew "Rob Reiner (dir.), Wil Wheaton, River Phoenix",
    :imDbRating "8.0",
    :title "Stand by Me",
    :year "1986",
    :id "tt0092005",
    :image
    "https://m.media-amazon.com/images/M/MV5BODJmY2Y2OGQtMDg2My00N2Q3LWJmZTUtYTc2ODBjZDVlNDlhXkEyXkFqcGdeQXVyMTQxNzMzNDI@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Stand by Me (1986)"}
   {:imDbRatingCount "854790",
    :rank "216",
    :crew "James Cameron (dir.), Arnold Schwarzenegger, Linda Hamilton",
    :imDbRating "8.0",
    :title "The Terminator",
    :year "1984",
    :id "tt0088247",
    :image
    "https://m.media-amazon.com/images/M/MV5BYTViNzMxZjEtZGEwNy00MDNiLWIzNGQtZDY2MjQ1OWViZjFmXkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "The Terminator (1984)"}
   {:imDbRatingCount "465273",
    :rank "217",
    :crew "Tom McCarthy (dir.), Mark Ruffalo, Michael Keaton",
    :imDbRating "8.0",
    :title "Spotlight",
    :year "2015",
    :id "tt1895587",
    :image
    "https://m.media-amazon.com/images/M/MV5BMjIyOTM5OTIzNV5BMl5BanBnXkFtZTgwMDkzODE2NjE@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Spotlight (2015)"}
   {:imDbRatingCount "475428",
    :rank "218",
    :crew "Ron Howard (dir.), Daniel Brühl, Chris Hemsworth",
    :imDbRating "8.0",
    :title "Rush",
    :year "2013",
    :id "tt1979320",
    :image
    "https://m.media-amazon.com/images/M/MV5BOWEwODJmZDItYTNmZC00OGM4LThlNDktOTQzZjIzMGQxODA4XkEyXkFqcGdeQXVyNjU0OTQ0OTY@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Rush (2013)"}
   {:imDbRatingCount "747206",
    :rank "219",
    :crew "James Mangold (dir.), Hugh Jackman, Patrick Stewart",
    :imDbRating "8.0",
    :title "Logan",
    :year "2017",
    :id "tt3315342",
    :image
    "https://m.media-amazon.com/images/M/MV5BYzc5MTU4N2EtYTkyMi00NjdhLTg3NWEtMTY4OTEyMzJhZTAzXkEyXkFqcGdeQXVyNjc1NTYyMjg@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Logan (2017)"}
   {:imDbRatingCount "158935",
    :rank "220",
    :crew "Sidney Lumet (dir.), Faye Dunaway, William Holden",
    :imDbRating "8.0",
    :title "Network",
    :year "1976",
    :id "tt0074958",
    :image
    "https://m.media-amazon.com/images/M/MV5BNzY0NjU5ODUtOTAzMC00NTU5LWJkZjctYWMyOWY2MTZmOWM1XkEyXkFqcGdeQXVyMTI3ODAyMzE2._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Network (1976)"}
   {:imDbRatingCount "722286",
    :rank "221",
    :crew "Brad Bird (dir.), Brad Garrett, Lou Romano",
    :imDbRating "8.0",
    :title "Ratatouille",
    :year "2007",
    :id "tt0382932",
    :image
    "https://m.media-amazon.com/images/M/MV5BMTMzODU0NTkxMF5BMl5BanBnXkFtZTcwMjQ4MzMzMw@@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Ratatouille (2007)"}
   {:imDbRatingCount "618679",
    :rank "222",
    :crew "Sean Penn (dir.), Emile Hirsch, Vince Vaughn",
    :imDbRating "8.0",
    :title "Into the Wild",
    :year "2007",
    :id "tt0758758",
    :image
    "https://m.media-amazon.com/images/M/MV5BNjQ0ODlhMWUtNmUwMS00YjExLWI4MjQtNjVmMmE2Y2E0MGRmXkEyXkFqcGdeQXVyNDk3NzU2MTQ@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Into the Wild (2007)"}
   {:imDbRatingCount "396025",
    :rank "223",
    :crew "Victor Fleming (dir.), Judy Garland, Frank Morgan",
    :imDbRating "8.0",
    :title "The Wizard of Oz",
    :year "1939",
    :id "tt0032138",
    :image
    "https://m.media-amazon.com/images/M/MV5BNjUyMTc4MDExMV5BMl5BanBnXkFtZTgwNDg0NDIwMjE@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "The Wizard of Oz (1939)"}
   {:imDbRatingCount "624042",
    :rank "224",
    :crew "Harold Ramis (dir.), Bill Murray, Andie MacDowell",
    :imDbRating "8.0",
    :title "Groundhog Day",
    :year "1993",
    :id "tt0107048",
    :image
    "https://m.media-amazon.com/images/M/MV5BZWIxNzM5YzQtY2FmMS00Yjc3LWI1ZjUtNGVjMjMzZTIxZTIxXkEyXkFqcGdeQXVyNjU0OTQ0OTY@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Groundhog Day (1993)"}
   {:imDbRatingCount "261742",
    :rank "225",
    :crew "Richard Linklater (dir.), Ethan Hawke, Julie Delpy",
    :imDbRating "8.0",
    :title "Before Sunset",
    :year "2004",
    :id "tt0381681",
    :image
    "https://m.media-amazon.com/images/M/MV5BMTQ1MjAwNTM5Ml5BMl5BanBnXkFtZTYwNDM0MTc3._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Before Sunset (2004)"}
   {:imDbRatingCount "400215",
    :rank "226",
    :crew "William Friedkin (dir.), Ellen Burstyn, Max von Sydow",
    :imDbRating "8.0",
    :title "The Exorcist",
    :year "1973",
    :id "tt0070047",
    :image
    "https://m.media-amazon.com/images/M/MV5BYWFlZGY2NDktY2ZjOS00ZWNkLTg0ZDAtZDY4MTM1ODU4ZjljXkEyXkFqcGdeQXVyMjUzOTY1NTc@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "The Exorcist (1973)"}
   {:imDbRatingCount "64361",
    :rank "227",
    :crew "William Wyler (dir.), Myrna Loy, Dana Andrews",
    :imDbRating "8.0",
    :title "The Best Years of Our Lives",
    :year "1946",
    :id "tt0036868",
    :image
    "https://m.media-amazon.com/images/M/MV5BY2RmNTRjYzctODI4Ni00MzQyLWEyNTAtNjU0N2JkMTNhNjJkXkEyXkFqcGdeQXVyNjU0OTQ0OTY@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "The Best Years of Our Lives (1946)"}
   {:imDbRatingCount "726005",
    :rank "228",
    :crew "Brad Bird (dir.), Craig T. Nelson, Samuel L. Jackson",
    :imDbRating "8.0",
    :title "The Incredibles",
    :year "2004",
    :id "tt0317705",
    :image
    "https://m.media-amazon.com/images/M/MV5BMTY5OTU0OTc2NV5BMl5BanBnXkFtZTcwMzU4MDcyMQ@@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "The Incredibles (2004)"}
   {:imDbRatingCount "37012",
    :rank "229",
    :crew "Ernst Lubitsch (dir.), Carole Lombard, Jack Benny",
    :imDbRating "8.0",
    :title "To Be or Not to Be",
    :year "1942",
    :id "tt0035446",
    :image
    "https://m.media-amazon.com/images/M/MV5BODZlOGI5ZjYtN2UwNy00OGY0LTgxY2UtNDZhMzBkN2EyZmIyXkEyXkFqcGdeQXVyNTgyNTA4MjM@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "To Be or Not to Be (1942)"}
   {:imDbRatingCount "92981",
    :rank "230",
    :crew "John Ford (dir.), Henry Fonda, Jane Darwell",
    :imDbRating "8.0",
    :title "The Grapes of Wrath",
    :year "1940",
    :id "tt0032551",
    :image
    "https://m.media-amazon.com/images/M/MV5BNzJiOGI2MjctYjUyMS00ZjkzLWE2ZmUtOTg4NTZkOTNhZDc1L2ltYWdlXkEyXkFqcGdeQXVyNjc1NTYyMjg@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "The Grapes of Wrath (1940)"}
   {:imDbRatingCount "59987",
    :rank "231",
    :crew "Gillo Pontecorvo (dir.), Brahim Hadjadj, Jean Martin",
    :imDbRating "8.0",
    :title "The Battle of Algiers",
    :year "1966",
    :id "tt0058946",
    :image
    "https://m.media-amazon.com/images/M/MV5BN2M4YTA4ZTEtN2EyNy00YTlmLWE4YzYtYjYyYjRkMWM4ZDM0XkEyXkFqcGdeQXVyMjUzOTY1NTc@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "The Battle of Algiers (1966)"}
   {:imDbRatingCount "136667",
    :rank "232",
    :crew "Alfred Hitchcock (dir.), Laurence Olivier, Joan Fontaine",
    :imDbRating "8.0",
    :title "Rebecca",
    :year "1940",
    :id "tt0032976",
    :image
    "https://m.media-amazon.com/images/M/MV5BYTcxYWExOTMtMWFmYy00ZjgzLWI0YjktNWEzYzJkZTg0NDdmL2ltYWdlXkEyXkFqcGdeQXVyNjc1NTYyMjg@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Rebecca (1940)"}
   {:imDbRatingCount "282415",
    :rank "233",
    :crew "Lasse Hallström (dir.), Richard Gere, Joan Allen",
    :imDbRating "8.0",
    :title "Hachi: A Dog's Tale",
    :year "2009",
    :id "tt1028532",
    :image
    "https://m.media-amazon.com/images/M/MV5BNzE4NDg5OWMtMzg3NC00ZDRjLTllMDMtZTRjNWZmNjBmMGZlXkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Hachi: A Dog's Tale (2009)"}
   {:imDbRatingCount "176441",
    :rank "234",
    :crew "Stuart Rosenberg (dir.), Paul Newman, George Kennedy",
    :imDbRating "8.0",
    :title "Cool Hand Luke",
    :year "1967",
    :id "tt0061512",
    :image
    "https://m.media-amazon.com/images/M/MV5BOWFlNzZhYmYtYTI5YS00MDQyLWIyNTUtNTRjMWUwNTEzNjA0XkEyXkFqcGdeQXVyNjUwNzk3NDc@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Cool Hand Luke (1967)"}
   {:imDbRatingCount "239435",
    :rank "235",
    :crew "Alejandro G. Iñárritu (dir.), Emilio Echevarría, Gael García Bernal",
    :imDbRating "8.0",
    :title "Amores perros",
    :year "2000",
    :id "tt0245712",
    :image
    "https://m.media-amazon.com/images/M/MV5BZjUxNmEwOGItMTBmYi00MWQ1LWExY2MtNDUxMjI0OWM4M2NiXkEyXkFqcGdeQXVyMjUzOTY1NTc@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Amores perros (2000)"}
   {:imDbRatingCount "1112929",
    :rank "236",
    :crew "Gore Verbinski (dir.), Johnny Depp, Geoffrey Rush",
    :imDbRating "8.0",
    :title "Pirates of the Caribbean: The Curse of the Black Pearl",
    :year "2003",
    :id "tt0325980",
    :image
    "https://m.media-amazon.com/images/M/MV5BNGYyZGM5MGMtYTY2Ni00M2Y1LWIzNjQtYWUzM2VlNGVhMDNhXkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Pirates of the Caribbean: The Curse of the Black Pearl (2003)"}
   {:imDbRatingCount "171625",
    :rank "237",
    :crew "Mathieu Kassovitz (dir.), Vincent Cassel, Hubert Koundé",
    :imDbRating "8.0",
    :title "La Haine",
    :year "1995",
    :id "tt0113247",
    :image
    "https://m.media-amazon.com/images/M/MV5BOTQxOGU0OWUtMzExYy00ZjIxLWJmMzAtNTI1Y2YxYTMxN2RkXkEyXkFqcGdeQXVyMjUzOTY1NTc@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "La Haine (1995)"}
   {:imDbRatingCount "86451",
    :rank "238",
    :crew "Cagan Irmak (dir.), Çetin Tekindor, Fikret Kuskan",
    :imDbRating "8.0",
    :title "My Father and My Son",
    :year "2005",
    :id "tt0476735",
    :image
    "https://m.media-amazon.com/images/M/MV5BNjAzMzEwYzctNjc1MC00Nzg5LWFmMGItMTgzYmMyNTY2OTQ4XkEyXkFqcGdeQXVyNjU0OTQ0OTY@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "My Father and My Son (2005)"}
   {:imDbRatingCount "117236",
    :rank "239",
    :crew "François Truffaut (dir.), Jean-Pierre Léaud, Albert Rémy",
    :imDbRating "8.0",
    :title "The 400 Blows",
    :year "1959",
    :id "tt0053198",
    :image
    "https://m.media-amazon.com/images/M/MV5BYTQ4MjA4NmYtYjRhNi00MTEwLTg0NjgtNjk3ODJlZGU4NjRkL2ltYWdlL2ltYWdlXkEyXkFqcGdeQXVyNjU0OTQ0OTY@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "The 400 Blows (1959)"}
   {:imDbRatingCount "117782",
    :rank "240",
    :crew "Ingmar Bergman (dir.), Bibi Andersson, Liv Ullmann",
    :imDbRating "8.0",
    :title "Persona",
    :year "1966",
    :id "tt0060827",
    :image
    "https://m.media-amazon.com/images/M/MV5BYmFlOTcxMWUtZTMzMi00NWIyLTkwOTEtNjIxNmViNzc2Yzc1XkEyXkFqcGdeQXVyMjUzOTY1NTc@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Persona (1966)"}
   {:imDbRatingCount "103568",
    :rank "241",
    :crew "Frank Capra (dir.), Clark Gable, Claudette Colbert",
    :imDbRating "8.0",
    :title "It Happened One Night",
    :year "1934",
    :id "tt0025316",
    :image
    "https://m.media-amazon.com/images/M/MV5BYzJmMWE5NjAtNWMyZS00NmFiLWIwMDgtZDE2NzczYWFhNzIzXkEyXkFqcGdeQXVyNjc1NTYyMjg@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "It Happened One Night (1934)"}
   {:imDbRatingCount "231773",
    :rank "242",
    :crew "Robert Wise (dir.), Julie Andrews, Christopher Plummer",
    :imDbRating "8.0",
    :title "The Sound of Music",
    :year "1965",
    :id "tt0059742",
    :image
    "https://m.media-amazon.com/images/M/MV5BODIxNjhkYjEtYzUyMi00YTNjLWE1YjktNjAyY2I2MWNkNmNmL2ltYWdlL2ltYWdlXkEyXkFqcGdeQXVyMTQxNzMzNDI@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "The Sound of Music (1965)"}
   {:imDbRatingCount "397083",
    :rank "243",
    :crew "Terry Jones (dir.), Graham Chapman, John Cleese",
    :imDbRating "8.0",
    :title "Life of Brian",
    :year "1979",
    :id "tt0079470",
    :image
    "https://m.media-amazon.com/images/M/MV5BMDA1ZWI4ZDItOTRlYi00OTUxLWFlNWQtMzM5NDI0YjA4ZGI2XkEyXkFqcGdeQXVyMjUzOTY1NTc@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Life of Brian (1979)"}
   {:imDbRatingCount "143684",
    :rank "244",
    :crew "Park Chan-wook (dir.), Kim Min-hee, Ha Jung-woo",
    :imDbRating "8.0",
    :title "The Handmaiden",
    :year "2016",
    :id "tt4016934",
    :image
    "https://m.media-amazon.com/images/M/MV5BNDJhYTk2MTctZmVmOS00OTViLTgxNjQtMzQxOTRiMDdmNGRjXkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "The Handmaiden (2016)"}
   {:imDbRatingCount "29375",
    :rank "245",
    :crew "Akira Kurosawa (dir.), Maksim Munzuk, Yuriy Solomin",
    :imDbRating "8.0",
    :title "Dersu Uzala",
    :year "1975",
    :id "tt0071411",
    :image
    "https://m.media-amazon.com/images/M/MV5BYWY0OWJlZTgtMWUzNy00MGJhLTk5YzQtNmY5MDEwOTIxNjMyXkEyXkFqcGdeQXVyNjc1NTYyMjg@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Dersu Uzala (1975)"}
   {:imDbRatingCount "196790",
    :rank "246",
    :crew "T.J. Gnanavel (dir.), Suriya, Lijo Mol Jose",
    :imDbRating "8.0",
    :title "Jai Bhim",
    :year "2021",
    :id "tt15097216",
    :image
    "https://m.media-amazon.com/images/M/MV5BOTM0NWFjNGYtNjExMS00ZTZlLWFiYmMtZmU4ZjZkMmMxZTNjXkEyXkFqcGdeQXVyODEyNjEwMDk@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Jai Bhim (2021)"}
   {:imDbRatingCount "413269",
    :rank "247",
    :crew "Ron Clements (dir.), Scott Weinger, Robin Williams",
    :imDbRating "8.0",
    :title "Aladdin",
    :year "1992",
    :id "tt0103639",
    :image
    "https://m.media-amazon.com/images/M/MV5BY2Q2NDI1MjUtM2Q5ZS00MTFlLWJiYWEtNTZmNjQ3OGJkZDgxXkEyXkFqcGdeQXVyNTI4MjkwNjA@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Aladdin (1992)"}
   {:imDbRatingCount "230683",
    :rank "248",
    :crew "Richard Attenborough (dir.), Ben Kingsley, John Gielgud",
    :imDbRating "8.0",
    :title "Gandhi",
    :year "1982",
    :id "tt0083987",
    :image
    "https://m.media-amazon.com/images/M/MV5BOGVmZGU2M2EtZTVjYy00OWU2LWI0YjEtZjQ4YjNmODhmMzhkXkEyXkFqcGdeQXVyNjk1Njg5NTA@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "Gandhi (1982)"}
   {:imDbRatingCount "455515",
    :rank "249",
    :crew "Tate Taylor (dir.), Emma Stone, Viola Davis",
    :imDbRating "8.0",
    :title "The Help",
    :year "2011",
    :id "tt1454029",
    :image
    "https://m.media-amazon.com/images/M/MV5BMTM5OTMyMjIxOV5BMl5BanBnXkFtZTcwNzU4MjIwNQ@@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "The Help (2011)"}
   {:imDbRatingCount "192585",
    :rank "250",
    :crew "Brad Bird (dir.), Eli Marienthal, Harry Connick Jr.",
    :imDbRating "8.0",
    :title "The Iron Giant",
    :year "1999",
    :id "tt0129167",
    :image
    "https://m.media-amazon.com/images/M/MV5BMjIxNDU2Njk0OV5BMl5BanBnXkFtZTgwODc3Njc3NjE@._V1_UX128_CR0,12,128,176_AL_.jpg",
    :fullTitle "The Iron Giant (1999)"}],
  :errorMessage ""})
