/**
 * 
 */

const createNav = () => {
  let nav = document.querySelector('.navbar');

  nav.innerHTML = `
        <div class="nav">
            <img src="/img/dark-logo.png" class="brand-logo" alt="">
            <div class="nav-items">
                <div class="search">
                    <input type="text" class="search-box" placeholder="search brand, product">
                    <button th:href="@{/store/search}" class="search-btn">search</button>
                </div>
                <a href="#"><img src="img/user.png" alt=""></a>
                <a href="#"><img src="img/cart.png" alt=""></a>
            </div>
        </div>
        <ul class="links-container">
            <li class="link-item"><a th:href="@{/store/index}" class="link">home</a></li>
            <li class="link-item"><a th:href="@{/store/products}" class="link">women</a></li>
            <li class="link-item"><a th:href="@{/store/products}" class="link">men</a></li>
            <li class="link-item"><a th:href="@{/store/products}" class="link">kids</a></li>
            <li class="link-item"><a th:href="@{/store/products}" class="link">accessories</a></li>
            <li class="link-item"><a th:href="@{/store/products}" class="link">market</a></li>
        </ul>
    `;
}

createNav();