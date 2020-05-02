
class Movies{

 public static void main(String[] args) {
     
// array with 3 movies
// the title of the movie and its date coming out 
// with the 3 principal actors of each movies
// [title][date],[actors]

String actorsMovies [][] =   {
                                            { "Indiana Jones and the Kingdom of the Crystal Skull" ,
        
                                                 "Harrison Ford", "Cate Blanchett", "Karen Allen" }
                                            ,
                                        
                                            {"Indiana Jones and the Last Crusade" , 
                                             
                                                 "Harrison Ford", "Sean Connery", "Denholm Elliott"}
                                            ,
                                                
                                            {"Indiana Jones and the Temple of Doom" , 
                                             
                                                 "Harrison Ford", "Kate Capshaw", "Jonathan Ke Quan"}
                                            }
                                            ;
    
    

for (int j = 0; j < actorsMovies.length; j++) {
    System.out.println("In the Movie titled :"+actorsMovies[j][0].toString());

    System.out.println("The principals actors are --> *");
    for (int i = 1; i < actorsMovies[j].length; i++) {
        System.out.println(" * "+ actorsMovies[j][i].toString());
        
    }
 
}



}
 

    
}