package experiments;


public class Cviko07_Tree
{
    private Cviko07_TreeNode root = null;

    public Cviko05_Item get(long key)
    {
        Cviko07_TreeNode kdeJsemTed = root;

        while(true){

            if(kdeJsemTed == null){
                return null;
            }
            if (kdeJsemTed.getKey() > key) {
                kdeJsemTed = kdeJsemTed.getRightChild();
            }
            else if(kdeJsemTed.getKey() < key) {
                kdeJsemTed = kdeJsemTed.getLeftChild();
            }
            else {
                return kdeJsemTed.getPayload();
            }
        }
    }

    public Cviko05_Item put(long key, Cviko05_Item payload)
    {
        if(root == null){
            root = new Cviko07_TreeNode(payload, null,null,key);
        } else {
            Cviko07_TreeNode newNode = new Cviko07_TreeNode(payload, null,null,key);

            Cviko07_TreeNode kdeJsemTed = root;

            while(true){

                if (key < kdeJsemTed.getKey()){
                    if(kdeJsemTed.getLeftChild() == null){
                        kdeJsemTed.setLeftChild(newNode);
                        return null;
                    }
                    kdeJsemTed = kdeJsemTed.getLeftChild();
                } else if (key > kdeJsemTed.getKey()) {
                    if(kdeJsemTed.getRightChild() == null){
                        kdeJsemTed.setRightChild(newNode);
                    }
                    kdeJsemTed = kdeJsemTed.getRightChild();
                } else {
                    Cviko05_Item old = kdeJsemTed.getPayload();
                    kdeJsemTed.setPayload(payload);
                    return old;
                }
            }

        }
        return null;
    }

    public Cviko05_Item remove(long key)
    {
        return null;
    }

    //Návod na mazání z binárního vyhledávacího stromu:
    //
    //Pokud mažeme uzel s jedním potomkem,
    //stačí přesměrovat hranu
    //
    //Pokud mažeme uzel X se dvěma potomky,
    //odstraníme nejdřív uzel s maximem v jeho levém podstromě
    //nebo minimem v jeho pravém podstromě (u obou je maximálně
    //jeden potomek). Hodnotu z tohoto odstraněného uzlu pak dáme
    //místo X.
}
