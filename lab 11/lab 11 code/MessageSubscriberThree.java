public class MessageSubscriberThree implements Observer
{
    //YOUR CODE
    public void update(Message m)
    {
        System.out.println("MessageSubscriberThree :: " + m.getMessageContent());
    }
}