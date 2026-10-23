# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class LineageImportRunEventDataset(object):
    """
    Dataset referenced by an imported OpenLineage run event.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new LineageImportRunEventDataset object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param key:
            The value to assign to the key property of this LineageImportRunEventDataset.
        :type key: str

        :param namespace:
            The value to assign to the namespace property of this LineageImportRunEventDataset.
        :type namespace: str

        :param name:
            The value to assign to the name property of this LineageImportRunEventDataset.
        :type name: str

        :param type:
            The value to assign to the type property of this LineageImportRunEventDataset.
        :type type: str

        """
        self.swagger_types = {
            'key': 'str',
            'namespace': 'str',
            'name': 'str',
            'type': 'str'
        }
        self.attribute_map = {
            'key': 'key',
            'namespace': 'namespace',
            'name': 'name',
            'type': 'type'
        }
        self._key = None
        self._namespace = None
        self._name = None
        self._type = None

    @property
    def key(self):
        """
        Gets the key of this LineageImportRunEventDataset.
        Catalog-object key when the dataset is linked to an AIDP object.


        :return: The key of this LineageImportRunEventDataset.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key):
        """
        Sets the key of this LineageImportRunEventDataset.
        Catalog-object key when the dataset is linked to an AIDP object.


        :param key: The key of this LineageImportRunEventDataset.
        :type: str
        """
        self._key = key

    @property
    def namespace(self):
        """
        Gets the namespace of this LineageImportRunEventDataset.
        Namespace of the dataset.


        :return: The namespace of this LineageImportRunEventDataset.
        :rtype: str
        """
        return self._namespace

    @namespace.setter
    def namespace(self, namespace):
        """
        Sets the namespace of this LineageImportRunEventDataset.
        Namespace of the dataset.


        :param namespace: The namespace of this LineageImportRunEventDataset.
        :type: str
        """
        self._namespace = namespace

    @property
    def name(self):
        """
        Gets the name of this LineageImportRunEventDataset.
        Name of the dataset.


        :return: The name of this LineageImportRunEventDataset.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this LineageImportRunEventDataset.
        Name of the dataset.


        :param name: The name of this LineageImportRunEventDataset.
        :type: str
        """
        self._name = name

    @property
    def type(self):
        """
        Gets the type of this LineageImportRunEventDataset.
        Type of the dataset when available.


        :return: The type of this LineageImportRunEventDataset.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """
        Sets the type of this LineageImportRunEventDataset.
        Type of the dataset when available.


        :param type: The type of this LineageImportRunEventDataset.
        :type: str
        """
        self._type = type

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
