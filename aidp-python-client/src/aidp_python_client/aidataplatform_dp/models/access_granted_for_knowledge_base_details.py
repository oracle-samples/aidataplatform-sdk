# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class AccessGrantedForKnowledgeBaseDetails(object):
    """
    Lakeproxy KnowledgeBase resource details.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new AccessGrantedForKnowledgeBaseDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param catalog_name:
            The value to assign to the catalog_name property of this AccessGrantedForKnowledgeBaseDetails.
        :type catalog_name: str

        :param database_name:
            The value to assign to the database_name property of this AccessGrantedForKnowledgeBaseDetails.
        :type database_name: str

        :param knowledge_base_name:
            The value to assign to the knowledge_base_name property of this AccessGrantedForKnowledgeBaseDetails.
        :type knowledge_base_name: str

        """
        self.swagger_types = {
            'catalog_name': 'str',
            'database_name': 'str',
            'knowledge_base_name': 'str'
        }
        self.attribute_map = {
            'catalog_name': 'catalogName',
            'database_name': 'databaseName',
            'knowledge_base_name': 'knowledgeBaseName'
        }
        self._catalog_name = None
        self._database_name = None
        self._knowledge_base_name = None

    @property
    def catalog_name(self):
        """
        **[Required]** Gets the catalog_name of this AccessGrantedForKnowledgeBaseDetails.
        Lakeproxy catalogName.


        :return: The catalog_name of this AccessGrantedForKnowledgeBaseDetails.
        :rtype: str
        """
        return self._catalog_name

    @catalog_name.setter
    def catalog_name(self, catalog_name):
        """
        Sets the catalog_name of this AccessGrantedForKnowledgeBaseDetails.
        Lakeproxy catalogName.


        :param catalog_name: The catalog_name of this AccessGrantedForKnowledgeBaseDetails.
        :type: str
        """
        self._catalog_name = catalog_name

    @property
    def database_name(self):
        """
        **[Required]** Gets the database_name of this AccessGrantedForKnowledgeBaseDetails.
        Lakeproxy databaseName.


        :return: The database_name of this AccessGrantedForKnowledgeBaseDetails.
        :rtype: str
        """
        return self._database_name

    @database_name.setter
    def database_name(self, database_name):
        """
        Sets the database_name of this AccessGrantedForKnowledgeBaseDetails.
        Lakeproxy databaseName.


        :param database_name: The database_name of this AccessGrantedForKnowledgeBaseDetails.
        :type: str
        """
        self._database_name = database_name

    @property
    def knowledge_base_name(self):
        """
        **[Required]** Gets the knowledge_base_name of this AccessGrantedForKnowledgeBaseDetails.
        Lakeproxy knowledgeBaseName.


        :return: The knowledge_base_name of this AccessGrantedForKnowledgeBaseDetails.
        :rtype: str
        """
        return self._knowledge_base_name

    @knowledge_base_name.setter
    def knowledge_base_name(self, knowledge_base_name):
        """
        Sets the knowledge_base_name of this AccessGrantedForKnowledgeBaseDetails.
        Lakeproxy knowledgeBaseName.


        :param knowledge_base_name: The knowledge_base_name of this AccessGrantedForKnowledgeBaseDetails.
        :type: str
        """
        self._knowledge_base_name = knowledge_base_name

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
