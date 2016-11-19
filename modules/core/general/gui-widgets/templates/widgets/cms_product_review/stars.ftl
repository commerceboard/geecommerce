<#if !wProduct??>
    <#assign wProduct=product >
</#if>

<div class="cms-product-review">
    <div class="reviews">
        <div class="rateit_${wProduct.id} review-rating-short">
            <div class="rateit" data-rateit-value="${average}" data-rateit-ispreset="true" data-rateit-readonly="true"></div>
            <a class="customer-review-link" href="/review/view/${wProduct.id}" >${total}
                    <@message text="Customer reviews" lang="en" text2="Kundenrezensionen" lang2="de" /></a>
        </div>
    </div>
</div>
