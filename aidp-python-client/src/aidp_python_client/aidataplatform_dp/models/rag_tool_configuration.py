# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class RagToolConfiguration(object):
    """
    Tool configurations are set by the agent developer when they create the tool. | The agent does not see those configurations and can NOT modify their values
    """

    def __init__(self, **kwargs):
        """
        Initializes a new RagToolConfiguration object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param catalog_key:
            The value to assign to the catalog_key property of this RagToolConfiguration.
        :type catalog_key: str

        :param schema_key:
            The value to assign to the schema_key property of this RagToolConfiguration.
        :type schema_key: str

        :param knowledge_base:
            The value to assign to the knowledge_base property of this RagToolConfiguration.
        :type knowledge_base: str

        :param llm:
            The value to assign to the llm property of this RagToolConfiguration.
        :type llm: oci.aidataplatform_dp.models.LlmConfig

        :param model_settings:
            The value to assign to the model_settings property of this RagToolConfiguration.
        :type model_settings: dict(str, object)

        :param top_k:
            The value to assign to the top_k property of this RagToolConfiguration.
        :type top_k: int

        """
        self.swagger_types = {
            'catalog_key': 'str',
            'schema_key': 'str',
            'knowledge_base': 'str',
            'llm': 'LlmConfig',
            'model_settings': 'dict(str, object)',
            'top_k': 'int'
        }

        self.attribute_map = {
            'catalog_key': 'catalogKey',
            'schema_key': 'schemaKey',
            'knowledge_base': 'knowledgeBase',
            'llm': 'llm',
            'model_settings': 'modelSettings',
            'top_k': 'topK'
        }

        self._catalog_key = None
        self._schema_key = None
        self._knowledge_base = None
        self._llm = None
        self._model_settings = None
        self._top_k = None

    @property
    def catalog_key(self):
        """
        Gets the catalog_key of this RagToolConfiguration.
        The Catalog to use for KB tool execution


        :return: The catalog_key of this RagToolConfiguration.
        :rtype: str
        """
        return self._catalog_key

    @catalog_key.setter
    def catalog_key(self, catalog_key):
        """
        Sets the catalog_key of this RagToolConfiguration.
        The Catalog to use for KB tool execution


        :param catalog_key: The catalog_key of this RagToolConfiguration.
        :type: str
        """
        self._catalog_key = catalog_key

    @property
    def schema_key(self):
        """
        Gets the schema_key of this RagToolConfiguration.
        The Schema to use for KB tool execution


        :return: The schema_key of this RagToolConfiguration.
        :rtype: str
        """
        return self._schema_key

    @schema_key.setter
    def schema_key(self, schema_key):
        """
        Sets the schema_key of this RagToolConfiguration.
        The Schema to use for KB tool execution


        :param schema_key: The schema_key of this RagToolConfiguration.
        :type: str
        """
        self._schema_key = schema_key

    @property
    def knowledge_base(self):
        """
        Gets the knowledge_base of this RagToolConfiguration.
        The name of the Knowledge Base to use for RAG query


        :return: The knowledge_base of this RagToolConfiguration.
        :rtype: str
        """
        return self._knowledge_base

    @knowledge_base.setter
    def knowledge_base(self, knowledge_base):
        """
        Sets the knowledge_base of this RagToolConfiguration.
        The name of the Knowledge Base to use for RAG query


        :param knowledge_base: The knowledge_base of this RagToolConfiguration.
        :type: str
        """
        self._knowledge_base = knowledge_base

    @property
    def llm(self):
        """
        Gets the llm of this RagToolConfiguration.

        :return: The llm of this RagToolConfiguration.
        :rtype: oci.aidataplatform_dp.models.LlmConfig
        """
        return self._llm

    @llm.setter
    def llm(self, llm):
        """
        Sets the llm of this RagToolConfiguration.

        :param llm: The llm of this RagToolConfiguration.
        :type: oci.aidataplatform_dp.models.LlmConfig
        """
        self._llm = llm

    @property
    def model_settings(self):
        """
        Gets the model_settings of this RagToolConfiguration.
        Model specific inference parameters such as temperature, top-k, max length, response format, etc.


        :return: The model_settings of this RagToolConfiguration.
        :rtype: dict(str, object)
        """
        return self._model_settings

    @model_settings.setter
    def model_settings(self, model_settings):
        """
        Sets the model_settings of this RagToolConfiguration.
        Model specific inference parameters such as temperature, top-k, max length, response format, etc.


        :param model_settings: The model_settings of this RagToolConfiguration.
        :type: dict(str, object)
        """
        self._model_settings = model_settings

    @property
    def top_k(self):
        """
        Gets the top_k of this RagToolConfiguration.
        Number of top chunks to retrieve from the KB


        :return: The top_k of this RagToolConfiguration.
        :rtype: int
        """
        return self._top_k

    @top_k.setter
    def top_k(self, top_k):
        """
        Sets the top_k of this RagToolConfiguration.
        Number of top chunks to retrieve from the KB


        :param top_k: The top_k of this RagToolConfiguration.
        :type: int
        """
        self._top_k = top_k

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
