# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class CreateOntologyProjectDetails(object):
    """
    CreateOntologyProjectDetails model.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new CreateOntologyProjectDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param workspace_id:
            The value to assign to the workspace_id property of this CreateOntologyProjectDetails.
        :type workspace_id: str

        :param key:
            The value to assign to the key property of this CreateOntologyProjectDetails.
        :type key: str

        :param display_name:
            The value to assign to the display_name property of this CreateOntologyProjectDetails.
        :type display_name: str

        :param description:
            The value to assign to the description property of this CreateOntologyProjectDetails.
        :type description: str

        :param namespace:
            The value to assign to the namespace property of this CreateOntologyProjectDetails.
        :type namespace: str

        :param workspace_base_path:
            The value to assign to the workspace_base_path property of this CreateOntologyProjectDetails.
        :type workspace_base_path: str

        """
        self.swagger_types = {
            'workspace_id': 'str',
            'key': 'str',
            'display_name': 'str',
            'description': 'str',
            'namespace': 'str',
            'workspace_base_path': 'str'
        }

        self.attribute_map = {
            'workspace_id': 'workspaceId',
            'key': 'key',
            'display_name': 'displayName',
            'description': 'description',
            'namespace': 'namespace',
            'workspace_base_path': 'workspaceBasePath'
        }

        self._workspace_id = None
        self._key = None
        self._display_name = None
        self._description = None
        self._namespace = None
        self._workspace_base_path = None

    @property
    def workspace_id(self):
        """
        **[Required]** Gets the workspace_id of this CreateOntologyProjectDetails.

        :return: The workspace_id of this CreateOntologyProjectDetails.
        :rtype: str
        """
        return self._workspace_id

    @workspace_id.setter
    def workspace_id(self, workspace_id):
        """
        Sets the workspace_id of this CreateOntologyProjectDetails.

        :param workspace_id: The workspace_id of this CreateOntologyProjectDetails.
        :type: str
        """
        self._workspace_id = workspace_id

    @property
    def key(self):
        """
        **[Required]** Gets the key of this CreateOntologyProjectDetails.

        :return: The key of this CreateOntologyProjectDetails.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key):
        """
        Sets the key of this CreateOntologyProjectDetails.

        :param key: The key of this CreateOntologyProjectDetails.
        :type: str
        """
        self._key = key

    @property
    def display_name(self):
        """
        **[Required]** Gets the display_name of this CreateOntologyProjectDetails.

        :return: The display_name of this CreateOntologyProjectDetails.
        :rtype: str
        """
        return self._display_name

    @display_name.setter
    def display_name(self, display_name):
        """
        Sets the display_name of this CreateOntologyProjectDetails.

        :param display_name: The display_name of this CreateOntologyProjectDetails.
        :type: str
        """
        self._display_name = display_name

    @property
    def description(self):
        """
        Gets the description of this CreateOntologyProjectDetails.

        :return: The description of this CreateOntologyProjectDetails.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this CreateOntologyProjectDetails.

        :param description: The description of this CreateOntologyProjectDetails.
        :type: str
        """
        self._description = description

    @property
    def namespace(self):
        """
        Gets the namespace of this CreateOntologyProjectDetails.

        :return: The namespace of this CreateOntologyProjectDetails.
        :rtype: str
        """
        return self._namespace

    @namespace.setter
    def namespace(self, namespace):
        """
        Sets the namespace of this CreateOntologyProjectDetails.

        :param namespace: The namespace of this CreateOntologyProjectDetails.
        :type: str
        """
        self._namespace = namespace

    @property
    def workspace_base_path(self):
        """
        Gets the workspace_base_path of this CreateOntologyProjectDetails.

        :return: The workspace_base_path of this CreateOntologyProjectDetails.
        :rtype: str
        """
        return self._workspace_base_path

    @workspace_base_path.setter
    def workspace_base_path(self, workspace_base_path):
        """
        Sets the workspace_base_path of this CreateOntologyProjectDetails.

        :param workspace_base_path: The workspace_base_path of this CreateOntologyProjectDetails.
        :type: str
        """
        self._workspace_base_path = workspace_base_path

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
