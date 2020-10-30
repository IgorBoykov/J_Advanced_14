package Task;

import java.util.HashSet;
import java.util.Set;

public class Item {

	private int id;
	private int total;
	private Set<Cart> carts = new HashSet<>();

	public Item() {

	}

	public Item(int total) {
		this.total = total;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public Set<Cart> getCarts() {
		return carts;
	}

	public void setCarts(Set<Cart> carts) {
		this.carts = carts;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((carts == null) ? 0 : carts.hashCode());
		result = prime * result + id;
		result = prime * result + total;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (carts == null) {
			if (other.carts != null)
				return false;
		} else if (!carts.equals(other.carts))
			return false;
		if (id != other.id)
			return false;
		if (total != other.total)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", total=" + total + ", carts=" + carts + "]";
	}

}
