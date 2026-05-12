# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ObjectSuggestSummary(object):
    """
    A Suggest object in a Data Lake
    """

    def __init__(self, **kwargs):
        """
        Initializes a new ObjectSuggestSummary object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param display_name:
            The value to assign to the display_name property of this ObjectSuggestSummary.
        :type display_name: str

        :param type:
            The value to assign to the type property of this ObjectSuggestSummary.
        :type type: str

        :param path:
            The value to assign to the path property of this ObjectSuggestSummary.
        :type path: str

        :param key:
            The value to assign to the key property of this ObjectSuggestSummary.
        :type key: str

        :param workspace_key:
            The value to assign to the workspace_key property of this ObjectSuggestSummary.
        :type workspace_key: str

        :param catalog_key:
            The value to assign to the catalog_key property of this ObjectSuggestSummary.
        :type catalog_key: str

        :param schema_key:
            The value to assign to the schema_key property of this ObjectSuggestSummary.
        :type schema_key: str

        :param workspace_name:
            The value to assign to the workspace_name property of this ObjectSuggestSummary.
        :type workspace_name: str

        """
        self.swagger_types = {
            'display_name': 'str',
            'type': 'str',
            'path': 'str',
            'key': 'str',
            'workspace_key': 'str',
            'catalog_key': 'str',
            'schema_key': 'str',
            'workspace_name': 'str'
        }

        self.attribute_map = {
            'display_name': 'displayName',
            'type': 'type',
            'path': 'path',
            'key': 'key',
            'workspace_key': 'workspaceKey',
            'catalog_key': 'catalogKey',
            'schema_key': 'schemaKey',
            'workspace_name': 'workspaceName'
        }

        self._display_name = None
        self._type = None
        self._path = None
        self._key = None
        self._workspace_key = None
        self._catalog_key = None
        self._schema_key = None
        self._workspace_name = None

    @property
    def display_name(self):
        """
        **[Required]** Gets the display_name of this ObjectSuggestSummary.
        A user-friendly name.


        :return: The display_name of this ObjectSuggestSummary.
        :rtype: str
        """
        return self._display_name

    @display_name.setter
    def display_name(self, display_name):
        """
        Sets the display_name of this ObjectSuggestSummary.
        A user-friendly name.


        :param display_name: The display_name of this ObjectSuggestSummary.
        :type: str
        """
        self._display_name = display_name

    @property
    def type(self):
        """
        **[Required]** Gets the type of this ObjectSuggestSummary.
        The type of the Object


        :return: The type of this ObjectSuggestSummary.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """
        Sets the type of this ObjectSuggestSummary.
        The type of the Object


        :param type: The type of this ObjectSuggestSummary.
        :type: str
        """
        self._type = type

    @property
    def path(self):
        """
        **[Required]** Gets the path of this ObjectSuggestSummary.
        Path of object.


        :return: The path of this ObjectSuggestSummary.
        :rtype: str
        """
        return self._path

    @path.setter
    def path(self, path):
        """
        Sets the path of this ObjectSuggestSummary.
        Path of object.


        :param path: The path of this ObjectSuggestSummary.
        :type: str
        """
        self._path = path

    @property
    def key(self):
        """
        Gets the key of this ObjectSuggestSummary.
        Key of object.


        :return: The key of this ObjectSuggestSummary.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key):
        """
        Sets the key of this ObjectSuggestSummary.
        Key of object.


        :param key: The key of this ObjectSuggestSummary.
        :type: str
        """
        self._key = key

    @property
    def workspace_key(self):
        """
        Gets the workspace_key of this ObjectSuggestSummary.
        Key of the workspace.


        :return: The workspace_key of this ObjectSuggestSummary.
        :rtype: str
        """
        return self._workspace_key

    @workspace_key.setter
    def workspace_key(self, workspace_key):
        """
        Sets the workspace_key of this ObjectSuggestSummary.
        Key of the workspace.


        :param workspace_key: The workspace_key of this ObjectSuggestSummary.
        :type: str
        """
        self._workspace_key = workspace_key

    @property
    def catalog_key(self):
        """
        Gets the catalog_key of this ObjectSuggestSummary.
        Key of the catalog.


        :return: The catalog_key of this ObjectSuggestSummary.
        :rtype: str
        """
        return self._catalog_key

    @catalog_key.setter
    def catalog_key(self, catalog_key):
        """
        Sets the catalog_key of this ObjectSuggestSummary.
        Key of the catalog.


        :param catalog_key: The catalog_key of this ObjectSuggestSummary.
        :type: str
        """
        self._catalog_key = catalog_key

    @property
    def schema_key(self):
        """
        Gets the schema_key of this ObjectSuggestSummary.
        Key of the schema.


        :return: The schema_key of this ObjectSuggestSummary.
        :rtype: str
        """
        return self._schema_key

    @schema_key.setter
    def schema_key(self, schema_key):
        """
        Sets the schema_key of this ObjectSuggestSummary.
        Key of the schema.


        :param schema_key: The schema_key of this ObjectSuggestSummary.
        :type: str
        """
        self._schema_key = schema_key

    @property
    def workspace_name(self):
        """
        Gets the workspace_name of this ObjectSuggestSummary.
        Name of the workspace


        :return: The workspace_name of this ObjectSuggestSummary.
        :rtype: str
        """
        return self._workspace_name

    @workspace_name.setter
    def workspace_name(self, workspace_name):
        """
        Sets the workspace_name of this ObjectSuggestSummary.
        Name of the workspace


        :param workspace_name: The workspace_name of this ObjectSuggestSummary.
        :type: str
        """
        self._workspace_name = workspace_name

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
