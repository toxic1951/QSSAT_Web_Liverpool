<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>SendOpinionProduct</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>0</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <testSuiteGuid>6cb193c8-7c0d-437e-b4a2-e3af80fc724a</testSuiteGuid>
   <testCaseLink>
      <guid>e852dcbf-073e-4746-95ab-54becb2d197f</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/SET_UP_BROWSER/launch_browser</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>0727be09-b3d2-4df4-9c47-9e9b76f624db</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/HOME_PAGE/search_product</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>11c258af-7c2e-4fd9-b732-04da85e1dca5</id>
         <iterationEntity>
            <iterationType>RANGE</iterationType>
            <value>1-1</value>
         </iterationEntity>
         <testDataId>Data Files/PRODUCTS/ShoppingList</testDataId>
      </testDataLink>
      <variableLink>
         <testDataLinkId>11c258af-7c2e-4fd9-b732-04da85e1dca5</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>NOMBRE</value>
         <variableId>ba59d282-48bb-40cc-a59a-d31edca3a531</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>c367cef6-8d3b-45d4-b15f-6e3f8d9ce35a</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/PRODUCTS/CatalogProducts/GridProducts/select_product_catalog</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>66c10d89-506d-4d63-87c5-507304d3fe94</id>
         <iterationEntity>
            <iterationType>RANGE</iterationType>
            <value>1-1</value>
         </iterationEntity>
         <testDataId>Data Files/PRODUCTS/ShoppingList</testDataId>
      </testDataLink>
      <variableLink>
         <testDataLinkId>66c10d89-506d-4d63-87c5-507304d3fe94</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>NOMBRE</value>
         <variableId>4bfaa94c-296e-4907-b9af-99cf7f6cd7c9</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>69a8202d-3e99-49c4-8d29-e3ecde09e110</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/PRODUCTS/DetailProduct/ProductOpinion/access_product_opinion</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>f5bf4463-76a0-4e17-aeb1-02ff82c908e0</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/PRODUCTS/DetailProduct/ProductOpinion/send_opinion</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>bff74703-4624-4f27-8361-9a9cc2d3e3ac</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/SET_UP_BROWSER/close_browser</testCaseId>
   </testCaseLink>
</TestSuiteEntity>
