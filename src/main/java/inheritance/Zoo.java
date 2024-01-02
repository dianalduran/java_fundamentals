package inheritance;

public class Zoo {
    public static void main(String[] args){
        Dog rocky = new Dog();
        //rocky.fetch();
        //rocky.makeSound();
        feed(rocky);

        Animal sasha = new Dog();
        //sasha.makeSound();
        feed(sasha);

        if(sasha instanceof Dog sashaTheDog){
            sashaTheDog.fetch();
        }

        //instanceof pattern matching above the same as
        if(sasha instanceof Dog){
            Dog sashaTheDog = (Dog)sasha;
            sashaTheDog.fetch();
        }

        sasha = new Cat();
        //sasha.makeSound();
        //((Cat)sasha).scratch();
        feed(sasha);

    }

    public static void feed(Animal animal){
        if(animal instanceof Dog){
            System.out.println("Here's your dog food");
        }
        else if (animal instanceof Cat){
            System.out.println("Here's your cat food");
        }
    }
}
