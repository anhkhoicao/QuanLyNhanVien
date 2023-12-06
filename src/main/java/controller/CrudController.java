package controller;

public interface CrudController<Entity> {
    /*
     * Đọc/ghi dữ liệu trên giao diện
     */
    Entity getEntityFromForm();
    void setEntityToForm(Entity entity);
    void fillEntityListOnTable();
    Entity getEntityFromSelectedRow();
    /*
     * Mã điều khiển sự kiện CRUD
     */
    void initialize();
    void createEntity();
    void updateEntity();
    void deleteEntity();
    void editEntity();
    void resetForm();
    /*
     * Mã điều khiển sự kiện điều hướng
     */
    default void setSelectedRowIndex(int index){}
    default void moveFirst(){}
    default void movePrev(){}
    default void moveNext(){}
    default void moveLast(){}
}
