package controller;

public interface CrudController<Entity> {
    
    Entity getEntityFromForm();
    void setEntityToForm(Entity entity);
    void fillEntityListOnTable();
    Entity getEntityFromSelectedRow();
   
    void initialize();
    void createEntity();
    void updateEntity();
    void deleteEntity();
    void editEntity();
    void resetForm();
   
    default void setSelectedRowIndex(int index){}
    default void moveFirst(){}
    default void movePrev(){}
    default void moveNext(){}
    default void moveLast(){}
}
