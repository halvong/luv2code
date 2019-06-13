Luv2Code
6/13/19, Wed.

BaseballCoach can inject from a variety of HappyFortuneService-like classes because
it has private FortuneService interface. The config is in applicationContext. 

HappyFortuneService -> FortuneService (interface)
  getFortune()         getFortune()
      | From applicationContext
      v
BaseballCoach (class)->    Coach (interface)
FortuneService (interface)
getDailyFortune()          getDailyWorkout()
                           getDailyFortune()         
                    
                    