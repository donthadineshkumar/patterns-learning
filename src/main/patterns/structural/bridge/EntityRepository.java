package patterns.structural.bridge;

/**
 * Date: 10/12/13
 * Time: 6:01 PM
 */
public interface EntityRepository<T> {
    T store(T entity);
    T update(T entity);
    void delete(T entity);
    T setActive(T entity);
}
