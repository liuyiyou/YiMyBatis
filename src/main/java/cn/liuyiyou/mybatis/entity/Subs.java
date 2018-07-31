package  cn.liuyiyou.mybatis.entity;

import java.util.Date;

public class Subs  {
      /**
       * dbFiled: subs_id
       * 订单ID
       *
       */
       private Long  subsId;
      /**
       * dbFiled: union_subs_id
       * 合并订单号
       *
       */
       private Long  unionSubsId;
      /**
       * dbFiled: uid
       * 创建订单的用户ID
       *
       */
       private Integer  uid;
      /**
       * dbFiled: create_time
       * 用户生成订单的时间
       *
       */
       private Date  createTime;
      /**
       * dbFiled: total_price
       * 订单商品总价(元)
       *
       */
       private Float  totalPrice;
      /**
       * dbFiled: freight_price
       * 订单运费
       *
       */
       private Float  freightPrice;
      /**
       * dbFiled: tax_price
       * 订单税额
       *
       */
       private Float  taxPrice;
      /**
       * dbFiled: deduct_price
       * 扣减金额
       *
       */
       private Float  deductPrice;
      /**
       * dbFiled: deduct_type
       * 扣减类型（1红包扣减，8店主升级续费扣减）
       *
       */
       private Integer  deductType;
      /**
       * dbFiled: act_deduct_price
       * 活动满减额
       *
       */
       private Float  actDeductPrice;
      /**
       * dbFiled: coupon_deduct_price
       * 优惠券抵扣金额
       *
       */
       private Float  couponDeductPrice;
      /**
       * dbFiled: balance
       * 余额支付金额
       *
       */
       private Float  balance;
      /**
       * dbFiled: consign_idno
       * 收货人身份证号码
       *
       */
       private String  consignIdno;
      /**
       * dbFiled: oversea
       * 是否海外收货人：1表示国内；2表示海外
       *
       */
       private Integer  oversea;
      /**
       * dbFiled: consignee
       * 收货人信息: 默认填入用户的user.uname
       *
       */
       private String  consignee;
      /**
       * dbFiled: consign_phone
       * 收货人电话： 默认填入user 表里面的 account
       *
       */
       private String  consignPhone;
      /**
       * dbFiled: consign_addr
       * 收货人地址
       *
       */
       private String  consignAddr;
      /**
       * dbFiled: status
       * 订单状态： 1 待支付 2 已支付待发货 3 已发货 4 交易已完成 5 订单超时关闭
       *
       */
       private Integer  status;
      /**
       * dbFiled: declare_status
       * 报关状态：1 报关请求成功 2 报关请求失败
       *
       */
       private Integer  declareStatus;
      /**
       * dbFiled: status_time
       * 状态变更时间JSON格式 [[状态,状态时间]], 相当于一个历史记录表
       *
       */
       private String  statusTime;
      /**
       * dbFiled: return_status
       * 订单的退货退款状态：6-部分退货退款，7-整单退货退款
       *
       */
       private Integer  returnStatus;
      /**
       * dbFiled: return_time
       * 订单退货退款状态变更时间
       *
       */
       private Date  returnTime;
      /**
       * dbFiled: return_amount
       * 该订单发生的退货退款金额
       *
       */
       private Float  returnAmount;
      /**
       * dbFiled: cancel_reason
       * 取消订单的原因
       *
       */
       private String  cancelReason;
      /**
       * dbFiled: consign_country
       * 收货人所在区（对应ibalife_base.base_county.county_id）
       *
       */
       private Integer  consignCountry;
      /**
       * dbFiled: consign_province
       * 收货人所在省（对应ibalife_base.base_province.prov_id）
       *
       */
       private Integer  consignProvince;
      /**
       * dbFiled: consign_city
       * 收货人所在市（对应ibalife_base.base_city.city_id）
       *
       */
       private Integer  consignCity;
      /**
       * dbFiled: subsno
       * 交易订单编号
       *
       */
       private String  subsno;
      /**
       * dbFiled: pay_type
       * 支付方式 1-线下付款,2-支付宝,3-易宝,4-微信,5-银联,6-网付通
       *
       */
       private Integer  payType;
      /**
       * dbFiled: weight
       * 商品总重量
       *
       */
       private Float  weight;
      /**
       * dbFiled: payno
       * 支付码
       *
       */
       private String  payno;
      /**
       * dbFiled: tranno
       * 订单交易流水号
       *
       */
       private String  tranno;
      /**
       * dbFiled: sub_tranno
       * 拆单后报关返回的子订单交易流水号
       *
       */
       private String  subTranno;
      /**
       * dbFiled: expressno
       * 国际运单号
       *
       */
       private String  expressno;
      /**
       * dbFiled: uaccount
       * 创建订单的用户帐号
       *
       */
       private String  uaccount;
      /**
       * dbFiled: src
       * 订单来源（1表示网站，2表示微商城）
       *
       */
       private Integer  src;
      /**
       * dbFiled: mix
       * src,与mix配置形成多种订单类型
       *
       */
       private Integer  mix;
      /**
       * dbFiled: op_uid
       * 订单操作人Id
       *
       */
       private Integer  opUid;
      /**
       * dbFiled: channel
       * 渠道类型，标识订单从何种渠道生成 1PC浏览器，2微信，3 安卓客户端 ，4 IOS客户端
       *
       */
       private Integer  channel;
      /**
       * dbFiled: supplier_id
       * 供应商ID，引用ibalife_base.base_supplier.supplier_id
       *
       */
       private Integer  supplierId;
      /**
       * dbFiled: express_id
       * 国际的物流商ID，引用ibalife_base.base_express.express_id
       *
       */
       private Integer  expressId;
      /**
       * dbFiled: express_name
       * 国际物流商名称，引用ibalife_base.base_express.express_name
       *
       */
       private String  expressName;
      /**
       * dbFiled: inner_expno
       * 国内段的物流运单号
       *
       */
       private String  innerExpno;
      /**
       * dbFiled: inner_expid
       * 国内段的物流商ID，引用ibalife_base.base_express.express_id
       *
       */
       private Integer  innerExpid;
      /**
       * dbFiled: inner_expname
       * 国内段的物流商名称
       *
       */
       private String  innerExpname;
      /**
       * dbFiled: shop_id
       * 一键开店的店铺ID
       *
       */
       private Long  shopId;
      /**
       * dbFiled: remark
       * 留言操作json格式
       *
       */
       private String  remark;
      /**
       * dbFiled: act_id
       * 活动Id号
       *
       */
       private Long  actId;
      /**
       * dbFiled: pay_time
       * 订单支付时间
       *
       */
       private Date  payTime;
      /**
       * dbFiled: send_time
       * 订单发货时间
       *
       */
       private Date  sendTime;
      /**
       * dbFiled: distribute_time
       * 订单配送完成时间
       *
       */
       private Date  distributeTime;
      /**
       * dbFiled: done_time
       * 订单完成时间
       *
       */
       private Date  doneTime;
      /**
       * dbFiled: first_deduct
       * 
       *
       */
       private Float  firstDeduct;
      /**
       * dbFiled: terminal_id
       * 终端标识，对应user_terminal的id列
       *
       */
       private Long  terminalId;
      /**
       * dbFiled: serial_number
       * 记录用户下的第X单(在支付回调时才统计,统计非未支付,非订单关闭的状态)
       *
       */
       private Integer  serialNumber;
      /**
       * dbFiled: order_first
       * 0-非首单;1-首单;2不确定（未支付等情况）
       *
       */
       private Integer  orderFirst;
      /**
       * dbFiled: last_update_time
       * 最后修改日期
       *
       */
       private Date  lastUpdateTime;

   public  Long  getSubsId(){
       return subsId;
   }

   public  Subs   setSubsId(Long subsId){
         this.subsId  = subsId;
         return this;
   }
   public  Long  getUnionSubsId(){
       return unionSubsId;
   }

   public  Subs   setUnionSubsId(Long unionSubsId){
         this.unionSubsId  = unionSubsId;
         return this;
   }
   public  Integer  getUid(){
       return uid;
   }

   public  Subs   setUid(Integer uid){
         this.uid  = uid;
         return this;
   }
   public  Date  getCreateTime(){
       return createTime;
   }

   public  Subs   setCreateTime(Date createTime){
         this.createTime  = createTime;
         return this;
   }
   public  Float  getTotalPrice(){
       return totalPrice;
   }

   public  Subs   setTotalPrice(Float totalPrice){
         this.totalPrice  = totalPrice;
         return this;
   }
   public  Float  getFreightPrice(){
       return freightPrice;
   }

   public  Subs   setFreightPrice(Float freightPrice){
         this.freightPrice  = freightPrice;
         return this;
   }
   public  Float  getTaxPrice(){
       return taxPrice;
   }

   public  Subs   setTaxPrice(Float taxPrice){
         this.taxPrice  = taxPrice;
         return this;
   }
   public  Float  getDeductPrice(){
       return deductPrice;
   }

   public  Subs   setDeductPrice(Float deductPrice){
         this.deductPrice  = deductPrice;
         return this;
   }
   public  Integer  getDeductType(){
       return deductType;
   }

   public  Subs   setDeductType(Integer deductType){
         this.deductType  = deductType;
         return this;
   }
   public  Float  getActDeductPrice(){
       return actDeductPrice;
   }

   public  Subs   setActDeductPrice(Float actDeductPrice){
         this.actDeductPrice  = actDeductPrice;
         return this;
   }
   public  Float  getCouponDeductPrice(){
       return couponDeductPrice;
   }

   public  Subs   setCouponDeductPrice(Float couponDeductPrice){
         this.couponDeductPrice  = couponDeductPrice;
         return this;
   }
   public  Float  getBalance(){
       return balance;
   }

   public  Subs   setBalance(Float balance){
         this.balance  = balance;
         return this;
   }
   public  String  getConsignIdno(){
       return consignIdno;
   }

   public  Subs   setConsignIdno(String consignIdno){
         this.consignIdno  = consignIdno;
         return this;
   }
   public  Integer  getOversea(){
       return oversea;
   }

   public  Subs   setOversea(Integer oversea){
         this.oversea  = oversea;
         return this;
   }
   public  String  getConsignee(){
       return consignee;
   }

   public  Subs   setConsignee(String consignee){
         this.consignee  = consignee;
         return this;
   }
   public  String  getConsignPhone(){
       return consignPhone;
   }

   public  Subs   setConsignPhone(String consignPhone){
         this.consignPhone  = consignPhone;
         return this;
   }
   public  String  getConsignAddr(){
       return consignAddr;
   }

   public  Subs   setConsignAddr(String consignAddr){
         this.consignAddr  = consignAddr;
         return this;
   }
   public  Integer  getStatus(){
       return status;
   }

   public  Subs   setStatus(Integer status){
         this.status  = status;
         return this;
   }
   public  Integer  getDeclareStatus(){
       return declareStatus;
   }

   public  Subs   setDeclareStatus(Integer declareStatus){
         this.declareStatus  = declareStatus;
         return this;
   }
   public  String  getStatusTime(){
       return statusTime;
   }

   public  Subs   setStatusTime(String statusTime){
         this.statusTime  = statusTime;
         return this;
   }
   public  Integer  getReturnStatus(){
       return returnStatus;
   }

   public  Subs   setReturnStatus(Integer returnStatus){
         this.returnStatus  = returnStatus;
         return this;
   }
   public  Date  getReturnTime(){
       return returnTime;
   }

   public  Subs   setReturnTime(Date returnTime){
         this.returnTime  = returnTime;
         return this;
   }
   public  Float  getReturnAmount(){
       return returnAmount;
   }

   public  Subs   setReturnAmount(Float returnAmount){
         this.returnAmount  = returnAmount;
         return this;
   }
   public  String  getCancelReason(){
       return cancelReason;
   }

   public  Subs   setCancelReason(String cancelReason){
         this.cancelReason  = cancelReason;
         return this;
   }
   public  Integer  getConsignCountry(){
       return consignCountry;
   }

   public  Subs   setConsignCountry(Integer consignCountry){
         this.consignCountry  = consignCountry;
         return this;
   }
   public  Integer  getConsignProvince(){
       return consignProvince;
   }

   public  Subs   setConsignProvince(Integer consignProvince){
         this.consignProvince  = consignProvince;
         return this;
   }
   public  Integer  getConsignCity(){
       return consignCity;
   }

   public  Subs   setConsignCity(Integer consignCity){
         this.consignCity  = consignCity;
         return this;
   }
   public  String  getSubsno(){
       return subsno;
   }

   public  Subs   setSubsno(String subsno){
         this.subsno  = subsno;
         return this;
   }
   public  Integer  getPayType(){
       return payType;
   }

   public  Subs   setPayType(Integer payType){
         this.payType  = payType;
         return this;
   }
   public  Float  getWeight(){
       return weight;
   }

   public  Subs   setWeight(Float weight){
         this.weight  = weight;
         return this;
   }
   public  String  getPayno(){
       return payno;
   }

   public  Subs   setPayno(String payno){
         this.payno  = payno;
         return this;
   }
   public  String  getTranno(){
       return tranno;
   }

   public  Subs   setTranno(String tranno){
         this.tranno  = tranno;
         return this;
   }
   public  String  getSubTranno(){
       return subTranno;
   }

   public  Subs   setSubTranno(String subTranno){
         this.subTranno  = subTranno;
         return this;
   }
   public  String  getExpressno(){
       return expressno;
   }

   public  Subs   setExpressno(String expressno){
         this.expressno  = expressno;
         return this;
   }
   public  String  getUaccount(){
       return uaccount;
   }

   public  Subs   setUaccount(String uaccount){
         this.uaccount  = uaccount;
         return this;
   }
   public  Integer  getSrc(){
       return src;
   }

   public  Subs   setSrc(Integer src){
         this.src  = src;
         return this;
   }
   public  Integer  getMix(){
       return mix;
   }

   public  Subs   setMix(Integer mix){
         this.mix  = mix;
         return this;
   }
   public  Integer  getOpUid(){
       return opUid;
   }

   public  Subs   setOpUid(Integer opUid){
         this.opUid  = opUid;
         return this;
   }
   public  Integer  getChannel(){
       return channel;
   }

   public  Subs   setChannel(Integer channel){
         this.channel  = channel;
         return this;
   }
   public  Integer  getSupplierId(){
       return supplierId;
   }

   public  Subs   setSupplierId(Integer supplierId){
         this.supplierId  = supplierId;
         return this;
   }
   public  Integer  getExpressId(){
       return expressId;
   }

   public  Subs   setExpressId(Integer expressId){
         this.expressId  = expressId;
         return this;
   }
   public  String  getExpressName(){
       return expressName;
   }

   public  Subs   setExpressName(String expressName){
         this.expressName  = expressName;
         return this;
   }
   public  String  getInnerExpno(){
       return innerExpno;
   }

   public  Subs   setInnerExpno(String innerExpno){
         this.innerExpno  = innerExpno;
         return this;
   }
   public  Integer  getInnerExpid(){
       return innerExpid;
   }

   public  Subs   setInnerExpid(Integer innerExpid){
         this.innerExpid  = innerExpid;
         return this;
   }
   public  String  getInnerExpname(){
       return innerExpname;
   }

   public  Subs   setInnerExpname(String innerExpname){
         this.innerExpname  = innerExpname;
         return this;
   }
   public  Long  getShopId(){
       return shopId;
   }

   public  Subs   setShopId(Long shopId){
         this.shopId  = shopId;
         return this;
   }
   public  String  getRemark(){
       return remark;
   }

   public  Subs   setRemark(String remark){
         this.remark  = remark;
         return this;
   }
   public  Long  getActId(){
       return actId;
   }

   public  Subs   setActId(Long actId){
         this.actId  = actId;
         return this;
   }
   public  Date  getPayTime(){
       return payTime;
   }

   public  Subs   setPayTime(Date payTime){
         this.payTime  = payTime;
         return this;
   }
   public  Date  getSendTime(){
       return sendTime;
   }

   public  Subs   setSendTime(Date sendTime){
         this.sendTime  = sendTime;
         return this;
   }
   public  Date  getDistributeTime(){
       return distributeTime;
   }

   public  Subs   setDistributeTime(Date distributeTime){
         this.distributeTime  = distributeTime;
         return this;
   }
   public  Date  getDoneTime(){
       return doneTime;
   }

   public  Subs   setDoneTime(Date doneTime){
         this.doneTime  = doneTime;
         return this;
   }
   public  Float  getFirstDeduct(){
       return firstDeduct;
   }

   public  Subs   setFirstDeduct(Float firstDeduct){
         this.firstDeduct  = firstDeduct;
         return this;
   }
   public  Long  getTerminalId(){
       return terminalId;
   }

   public  Subs   setTerminalId(Long terminalId){
         this.terminalId  = terminalId;
         return this;
   }
   public  Integer  getSerialNumber(){
       return serialNumber;
   }

   public  Subs   setSerialNumber(Integer serialNumber){
         this.serialNumber  = serialNumber;
         return this;
   }
   public  Integer  getOrderFirst(){
       return orderFirst;
   }

   public  Subs   setOrderFirst(Integer orderFirst){
         this.orderFirst  = orderFirst;
         return this;
   }
   public  Date  getLastUpdateTime(){
       return lastUpdateTime;
   }

   public  Subs   setLastUpdateTime(Date lastUpdateTime){
         this.lastUpdateTime  = lastUpdateTime;
         return this;
   }

}