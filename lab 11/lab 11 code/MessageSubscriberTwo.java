public class MessageSubscriberTwo implements Observer
{
    //YOUR CODE
    public void update(Message m)
    {
        System.out.println("MessageSubscriberTwo :: " + m.getMessageContent());
    }
}