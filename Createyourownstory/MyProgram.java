public class MyProgram extends ConsoleProgram
{

    public void run()
    {
        Clear();
        System.out.println("Welcome To Choose Your Own Adventure: Office Edition");
        System.out.println("Answer using number 1,2,3 \nexcept when you ask to do something else");
        String start = readLine("Type in Yes in order to start :");
        if(start.equals("Yes") || start.equals("yes"))
        {
            Clear();
            Begin();
        }
        else if(start.equals("No")||start.equals("no"))
        {
            Clear();
            System.out.println("Sorry no No");
            run();
        }
        else
        {
            Clear();
            System.out.println("Only Yes or No");
            run();
        } 
    }
    
    private void Begin()
    {
        
        System.out.println("It's another boring day at your stupid office. \nYou spent most of the morning catching up on all the Internet \nyou missed while sleeping and now you're behind.\nYour stomach is growling because the banana you bought had \na weird brown lump on it. You know you should get back to work,\nbut you also know that you're hungry and don't care about your \njob at all. ");
        System.out.println("");
        System.out.println("1)SEARCH FOR FOOD \n    in the drawer that you haven't used since you started here \n    2 years ago.");
        System.out.println("2)CHECK EMAIL \n    to see if your boss sent any super-long emails you can read\n    to pass the time.");
        System.out.println("");
        int Answer = readInt("What do you do? :");
        if(Answer == 1)
        {
            GoToDrawer();    
        }
        else if(Answer == 2)
        {
            CheckEmail();
        }
        else
        {
            System.out.println("");
            Clear();
            System.out.println("Enter in 1 or 2 ONLY");
            Begin();
        }
    }
    
    private void GoToDrawer()
    {
        Clear();
        System.out.println("You open the mysterious drawer and are greeted with a \ncornucopia of disappointment!");
        System.out.println("");
        System.out.println("1)A BUNCH OF THUMBTACKS\n    that definitely aren't food and shouldn't be \n    treated as such.");
        System.out.println("2)OPENED PACK OF WILDBERRY POP TARTS (1 of 2)\n     do they even still make these?");
        System.out.println("3)ADDERALL PILLS\n     you bought off a high school kid who said his name \n     was Wolfgod.");
        System.out.println("");
        int Answer = readInt("What do you eat? :");
        if(Answer == 1)
        {
            ThumbTacks();    
        }
        else if(Answer == 2)
        {
            PopTarts();
        }
        else if(Answer ==3)
        {
            Pills();
        }
        else
        {
            System.out.println("");
            Clear();
            System.out.println("Enter in 1,2 or 3 ONLY");
            GoToDrawer();
        }
    }
    
    private void ThumbTacks()
    {
        Clear();
        System.out.println("In a fit of extreme hunger and stupidity you ingest \nlike ten thumbtacks and instantly die. \nIn all fairness the first two or three are pretty tasty, \nbut you're dead now so that doesn't really matter.");
        System.out.println("");
        ending();
    }
    
    private void PopTarts()
    {
        Clear();
        System.out.println("You house the leftover pastry tart and find that the berry \nfiling is as wild as its namesake. Your stomach does a \nFull 1080 Nosebone as you shuffle painfully to the bathroom.");
        System.out.println("");
        String start = readLine("Type in Yes to proceed to Restroom :");
        if(start.equals("Yes") || start.equals("yes"))
        {
            Clear();
            Bathroom();
        }
        else if(start.equals("No")||start.equals("no"))
        {
            Clear();
            System.out.println("Sorry no No");
            PopTarts();
        }
        else
        {
            Clear();
            System.out.println("Only Yes or No");
            PopTarts();
        } 
    }
    
    private void Bathroom()
    {
        System.out.println("You arrive at the restroom. It smells vaguely of farts \nand dreams that will never come true.");  
        System.out.println("");
        System.out.println("1)THE FIRST STALL \n     because it's closer");
        System.out.println("2)THE SECOND STALL \n     because it looks slightly cleaner");
        System.out.println("3)THE URINAL\n    because why not");
        System.out.println("");
        int Answer = readInt("Which stall do you use? :");
        if(Answer == 1)
        {
            firstStall();    
        }
        else if(Answer == 2)
        {
            secondStall();
        }
        else if(Answer ==3)
        {
            Urinal();
        }
        else
        {
            System.out.println("");
            Clear();
            System.out.println("Enter in 1,2 or 3 ONLY");
            Bathroom();
        }
    }
    
    private void firstStall()
    {
        Clear();
        System.out.println("At this point you're pretty sure \nthat pop tart was made entirely of poison. \nIt might be best if you took a quick nap \nto clear your head before going back to your desk.");
        System.out.println("");
        String start = readLine("Type in Yes to fall asleep and have a weird dream :");
        if(start.equals("Yes") || start.equals("yes"))
        {
            Clear();
            weirdDream();
        }
        else if(start.equals("No")||start.equals("no"))
        {
            Clear();
            System.out.println("Sorry no No");
            firstStall();
        }
        else
        {
            Clear();
            System.out.println("Only Yes or No");
            firstStall();
        } 
    }    
    
    private void weirdDream()
    {
        System.out.println("You stand in the middle of a vast cosmic desert. \nBefore you a Sphinx sits calmly. \nThe Sphinx is wearing a lot of lipstick. \nYou're not sure how you feel about that. \nThe Sphinx tells you that you must answer her riddle \nto return to the Waking Land.");
        System.out.println("");
        System.out.println("1)Fight the weird romantic vibes the Sphinx is giving off \nand just ANSWER THE RIDDLE");
        System.out.println("2)Give into the demands of your heart \nand MAKE OUT WITH THE SPHINX");
        System.out.println("");
        int Answer = readInt("What do you do? :");
        if(Answer == 1)
        {
            Fight();    
        }
        else if(Answer == 2)
        {
            demandLove();
        }
        else
        {
            System.out.println("");
            Clear();
            System.out.println("Enter in 1 or 2 ONLY");
            weirdDream();
        }
    }
    
    private void Fight()
    {
        Clear();
        System.out.println("The Sphinx gives you a riddle that you're pretty sure \nshe stole from the back of a Pop Tart box. \nYou answer it easily. She looks pretty bummed out, \nbut upholds her promise. You awake in the bathroom stall \nand quickly head back to your desk");
        System.out.println("");
        String start = readLine("Type in Yes to Go back to work, GOOGUS :");
        if(start.equals("Yes") || start.equals("yes"))
        {
            Clear();
            meetBoss();
        }
        else if(start.equals("No")||start.equals("no"))
        {
            Clear();
            System.out.println("Sorry no No");
            Fight();
        }
        else
        {
            Clear();
            System.out.println("Only Yes or No");
            Fight();
        } 
    }
    
    private void meetBoss()
    {
        System.out.println("Before you can make it back to your cubicle, \nyour boss interrupts you. He looks pretty peeved and \nasks you if you if you printed that document for him yet.\nYou're not sure what he's talking about or \nwhy he thinks that people can't notice that \nmustard stain on his pants.");
        System.out.println("");
        System.out.println("1)LIE TO HIM \n     you're pretty good at bluffing. One time you won \n     a game of poker once.");
        System.out.println("2)APOLOGIZE AND RUSH TO YOUR DESK\n      to check your email at once");
        System.out.println("");
        int Answer = readInt("What do you do? :");
        if(Answer == 1)
        {
            lie();    
        }
        else if(Answer == 2)
        {
            apologize();
        }
        else
        {
            System.out.println("");
            Clear();
            System.out.println("Enter in 1 or 2 ONLY");
            meetBoss();
        }
    }
    
    private void lie()
    {
        Clear();
        System.out.println("You tell your boss you might have the document and \nyou might not have it. You start to say something else but \nhe cuts you off by saying that you are fired. \nApparently you'd been skating o some pretty thin ice as is. \nYou pack up your things and think that maybe, in the end, \nthis was the best possible outcome.");
        System.out.println("");
        System.out.println("Two days later you are found dead in your apartment \nfrom a gas leak.");
        System.out.println("");
        ending();
    }
    
    private void apologize()
    {
        Clear();
        System.out.println("You skim your boss' email and find out he needs you to print something for him. He attached the file three times as a .PDF, .JPG and something called a .TUNGA. Just for shits you print all three and head over to the printing nook to see if for once the printer is actually working.");
        System.out.println("");
        String start = readLine("Type in Yes to go to printer nook :");
        if(start.equals("Yes") || start.equals("yes"))
        {
            Clear();
            printerNook();
        }
        else if(start.equals("No")||start.equals("no"))
        {
            Clear();
            System.out.println("Sorry no No");
            apologize();
        }
        else
        {
            Clear();
            System.out.println("Only Yes or No");
            apologize();
        } 
    }
    
    private void printerNook()
    {
        System.out.println("At the printing nook, you are greeted by that weird guy \nfrom sales who always werying to scan a document, \nbut doesn't know what the SCAN CODE is. \nYou look closely at him and realize that in \nthis lighting his blazer looks more blue-ish.");
        System.out.println("");
        System.out.println("1)Print your document and TELL INDIGO YOU DON'T KNOW THE CODE.");
        System.out.println("2)Print your document and TELL INDIGO THE CODE \nIS D2THEMIGHTYDUCKS.");
        System.out.println("3)Print your document and TELL INDIGO THE CODE \nIS CHICKENNUGZ.");
        int Answer = readInt("What do you do? :");
        if(Answer == 1)
        {
            DoNotKnowPassword();    
        }
        else if(Answer == 2)
        {
            PasswordisD2();
        }
        else if(Answer ==3)
        {
            PasswordisChicken();
        }
        else
        {
            System.out.println("");
            Clear();
            System.out.println("Enter in 1,2 or 3 ONLY");
            printerNook();
        }
    }
    
    private void DoNotKnowPassword()
    {
        Clear();
        System.out.println("You apologize to Indigo and quickly collect your document. \nHis beard droops in disappointment. \nYou start pretending to read the paper you printed to avoid any more awkward conversation.");
        System.out.println("");
        String start = readLine("Type in Yes to sneak a peak at Boss's DOC :");
        if(start.equals("Yes") || start.equals("yes"))
        {
            Clear();
            SneakAPeak();
        }
        else if(start.equals("No")||start.equals("no"))
        {
            Clear();
            System.out.println("Sorry no No");
            DoNotKnowPassword();
        }
        else
        {
            Clear();
            System.out.println("Only Yes or No");
            DoNotKnowPassword();
        }
    }
    
    private void SneakAPeak()
    {
        System.out.println("Weird, that document you printed for the boss \nis just a bunch of odd shapes. Maybe it's a magic eye? \nYou stare deeply into and think you can see either \nJesus or a turtle wearing a top hat.");
        System.out.println("");
        String start = readLine("Type in Yes to Stare Deeper into DOC :");
        if(start.equals("Yes") || start.equals("yes"))
        {
            Clear();
            StareDeep();
        }
        else if(start.equals("No")||start.equals("no"))
        {
            Clear();
            System.out.println("Sorry no No");
            SneakAPeak();
        }
        else
        {
            Clear();
            System.out.println("Only Yes or No");
            SneakAPeak();
        }
    }
    
    private void StareDeep()
    {
        System.out.println("Before you can uncover the mystery of this mystical memo, \nyour boss interrupts you. He looks pretty peeved and asks you if \nyou the paper you're holding is the one he asked you to print. \nWhy does this doofus have to take everything so goddamn seriously?");
        System.out.println("");
        System.out.println("1)GIVE DOCUMENT TO YOUR BOSS. \n     I mean why not, right?");
        System.out.println("2)LIE TO HIM. \nYou're not giving this thing up until you know what the hidden picture is!");
        System.out.println("");
        int Answer = readInt("What do you do? :");
        if(Answer == 1)
        {
            lie();    
        }
        else if(Answer == 2)
        {
            apologize();
        }
        else
        {
            System.out.println("");
            Clear();
            System.out.println("Enter in 1 or 2 ONLY");
            StareDeep();
        }
    }
    
    private void giveDocument()
    {
        System.out.println("You hand over the document. Your boss laughs, then shoves the whole thing in his mouth, causing him to activate his ANCIENT SNAKE FORM. Apparently that paper contained occult runes with the power to transform a human into a giant snake man. At least you assume that's what they were, you'll never know for sure because your boss is currently eating you. You now recall seeing this mentioned as a potential hazard in your work contract. You've really got to stop skimming things before signing them.");
        System.out.println("");
        ending();
    }
    
    private void LietoBoss()
    {
        
        System.out.println("You tell your boss that you don't know what he's talking about and quickly try to hide the paper. He gets really mad and pulls a large dagger out of his roomy Dockers performance slacks and proceeds to stab you with over and over again until you die. As your vision blurs you see him picking up the paper and laughing maniacally. Mondays, am I right?");
        System.out.println("");
        ending();
    }
    
    private void PasswordisD2()
    {   
        Clear();
        System.out.println("You fart a random code out of your brain-butt \nand decide to give it a shot. The printer starts \nsmoking and shaking violently. Indigo asks \nwhat the hell you did, to which you simply respond \nIt's Knuckle Puck Time? Just then, the printer explodes and \nyou both die in a violent explosion of shrapnel and cyan printer ink.");
        System.out.println("");
        ending();
    }
    
    private void PasswordisChicken()
    {
        System.out.println("You enter the code and the scanner boots up. \nIndigo is so pleased that he reveals \nhe was SECRETLY A WIZARD the entire time! \nHe explains he was actually scanning a humorous article \nfrom this month's MAGICIAN'S QUARTERLY \nto share with his grandson at WIZARD COLLEGE. \nAs a way of thanking you for your help, he gives you an \nENCHANTED CRYSTAL.Oh also you successfully print \nthat thingy your boss wanted.");
        System.out.println("");
        String start = readLine("Type in Yes to sneak a peak at Boss's DOC :");
        if(start.equals("Yes") || start.equals("yes"))
        {
            Clear();
            SneakAPeak();
        }
        else if(start.equals("No")||start.equals("no"))
        {
            Clear();
            System.out.println("Sorry no No");
            PasswordisChicken();
        }
        else
        {
            Clear();
            System.out.println("Only Yes or No");
            PasswordisChicken();
        }
    }
    
    private void demandLove()
    {
        Clear();
        System.out.println("You tell the Sphinx the only riddle you want to solve \nis how a creature so beautiful could be alone out here in the cosmic \nvoid of your subconscious. You lean in and kiss \nthis ancient monstrosity right on her gigantic lips. She invites you back to her place, \nbut nothing happens because you think she might be \ngetting a little clingy and you just got out of a bad relationship.");
        System.out.println("");
        String start = readLine("Type in Yes to WakeUp :");
        if(start.equals("Yes") || start.equals("yes"))
        {
            Clear();
            SneakAPeak();
        }
        else if(start.equals("No")||start.equals("no"))
        {
            Clear();
            System.out.println("Sorry no No");
            demandLove();
        }
        else
        {
            Clear();
            System.out.println("Only Yes or No");
            demandLove();
        }
    }
    
    private void secondStall()
    {
        Clear();
        System.out.println("You enter the stall only to find that the toilet is literally \noverflowing with SPIDERS. They look like brown recluses, \nbut you can't be positive because they are biting \nyou all over your body, which makes you feel rather dead.");
        System.out.println("");
        ending();
    }
    
    private void Urinal()
    {
        Clear();
        System.out.println("You sit down at the urinal, prepared to unleash a prank storm of \ndouchey delight, but your subconscious thinks better \nof it and you get a heart attack and die.");
        System.out.println("");
        ending();
    }
    
    private void Pills()
    {
        Clear();
        System.out.println("You take the adderall and brace yourself \nas a wave of focused ambition washes over you. \nFor a split second you remember what motivation feels \nlike and decide to actually try working.");
        System.out.println("");
        String start = readLine("Type in Yes to check Email forever :");
        if(start.equals("Yes") || start.equals("yes"))
        {
            Clear();
            CheckEmail();
        }
        else if(start.equals("No")||start.equals("no"))
        {
            Clear();
            System.out.println("Sorry no No");
            Pills();
        }
        else
        {
            Clear();
            System.out.println("Only Yes or No");
            Pills();
        }
    }
    
    private void CheckEmail()
    {
        Clear();
        System.out.println("You quickly discern that your boss' email is of \nthe most priority and diligently read \nthe whole thing, email signature and all. \nHe wants you to print something for him. \nYou notice that your boss also include a P.S. at \nthe end that reads:");
        System.out.println("");
        System.out.println("FYI: The new scanner code is CHICKENNUGZ");
        System.out.println("");
        System.out.println("You print out the document and rush over to the printing nook.");
        System.out.println("");
        String start = readLine("Type in Yes to go to printer nook :");
        if(start.equals("Yes") || start.equals("yes"))
        {
            Clear();
            printerNook();
        }
        else if(start.equals("No")||start.equals("no"))
        {
            Clear();
            System.out.println("Sorry no No");
            CheckEmail();
        }
        else
        {
            Clear();
            System.out.println("Only Yes or No");
            CheckEmail();
        }         
    }
    
    private void endingSecond()
    {
        System.out.println("THE END");
        System.out.println("");
        System.out.println("CONGRATULATIONS! YOU HAVE DEFEATED YET ANOTHER DAY OF YOUR INCREASINGLY MEANINGLESS LIFE.");
    }
    
    private void ending()
    {
        System.out.println("THE END");
        System.out.println("");
        System.out.println("YOU HAVE DIED IN A COMPLETELY UNEXPECTED MANNER.\nBUT HEY, AT LEAST THE REST OF THE OFFICE WILL PROBABLY \nGET A HALF-DAY, SO THERE'S THAT.");
    }

    private void Clear()
    {
        for(int i = 0; i < 20; i++)
        {
            System.out.println("");
        }
    }
}
