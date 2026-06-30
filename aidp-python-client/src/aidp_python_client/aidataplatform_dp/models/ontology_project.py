# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class OntologyProject(object):
    """
    Ontology Manager project metadata.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new OntologyProject object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param id:
            The value to assign to the id property of this OntologyProject.
        :type id: str

        :param workspace_id:
            The value to assign to the workspace_id property of this OntologyProject.
        :type workspace_id: str

        :param key:
            The value to assign to the key property of this OntologyProject.
        :type key: str

        :param display_name:
            The value to assign to the display_name property of this OntologyProject.
        :type display_name: str

        :param description:
            The value to assign to the description property of this OntologyProject.
        :type description: str

        :param namespace:
            The value to assign to the namespace property of this OntologyProject.
        :type namespace: str

        :param workspace_base_path:
            The value to assign to the workspace_base_path property of this OntologyProject.
        :type workspace_base_path: str

        :param lifecycle_state:
            The value to assign to the lifecycle_state property of this OntologyProject.
        :type lifecycle_state: str

        :param time_created:
            The value to assign to the time_created property of this OntologyProject.
        :type time_created: datetime

        :param time_updated:
            The value to assign to the time_updated property of this OntologyProject.
        :type time_updated: datetime

        :param version:
            The value to assign to the version property of this OntologyProject.
        :type version: int

        :param freeform_tags:
            The value to assign to the freeform_tags property of this OntologyProject.
        :type freeform_tags: dict(str, str)

        :param defined_tags:
            The value to assign to the defined_tags property of this OntologyProject.
        :type defined_tags: dict(str, dict(str, object))

        :param system_tags:
            The value to assign to the system_tags property of this OntologyProject.
        :type system_tags: dict(str, dict(str, object))

        """
        self.swagger_types = {
            'id': 'str',
            'workspace_id': 'str',
            'key': 'str',
            'display_name': 'str',
            'description': 'str',
            'namespace': 'str',
            'workspace_base_path': 'str',
            'lifecycle_state': 'str',
            'time_created': 'datetime',
            'time_updated': 'datetime',
            'version': 'int',
            'freeform_tags': 'dict(str, str)',
            'defined_tags': 'dict(str, dict(str, object))',
            'system_tags': 'dict(str, dict(str, object))'
        }

        self.attribute_map = {
            'id': 'id',
            'workspace_id': 'workspaceId',
            'key': 'key',
            'display_name': 'displayName',
            'description': 'description',
            'namespace': 'namespace',
            'workspace_base_path': 'workspaceBasePath',
            'lifecycle_state': 'lifecycleState',
            'time_created': 'timeCreated',
            'time_updated': 'timeUpdated',
            'version': 'version',
            'freeform_tags': 'freeformTags',
            'defined_tags': 'definedTags',
            'system_tags': 'systemTags'
        }

        self._id = None
        self._workspace_id = None
        self._key = None
        self._display_name = None
        self._description = None
        self._namespace = None
        self._workspace_base_path = None
        self._lifecycle_state = None
        self._time_created = None
        self._time_updated = None
        self._version = None
        self._freeform_tags = None
        self._defined_tags = None
        self._system_tags = None

    @property
    def id(self):
        """
        **[Required]** Gets the id of this OntologyProject.

        :return: The id of this OntologyProject.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """
        Sets the id of this OntologyProject.

        :param id: The id of this OntologyProject.
        :type: str
        """
        self._id = id

    @property
    def workspace_id(self):
        """
        **[Required]** Gets the workspace_id of this OntologyProject.

        :return: The workspace_id of this OntologyProject.
        :rtype: str
        """
        return self._workspace_id

    @workspace_id.setter
    def workspace_id(self, workspace_id):
        """
        Sets the workspace_id of this OntologyProject.

        :param workspace_id: The workspace_id of this OntologyProject.
        :type: str
        """
        self._workspace_id = workspace_id

    @property
    def key(self):
        """
        **[Required]** Gets the key of this OntologyProject.

        :return: The key of this OntologyProject.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key):
        """
        Sets the key of this OntologyProject.

        :param key: The key of this OntologyProject.
        :type: str
        """
        self._key = key

    @property
    def display_name(self):
        """
        **[Required]** Gets the display_name of this OntologyProject.

        :return: The display_name of this OntologyProject.
        :rtype: str
        """
        return self._display_name

    @display_name.setter
    def display_name(self, display_name):
        """
        Sets the display_name of this OntologyProject.

        :param display_name: The display_name of this OntologyProject.
        :type: str
        """
        self._display_name = display_name

    @property
    def description(self):
        """
        Gets the description of this OntologyProject.

        :return: The description of this OntologyProject.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this OntologyProject.

        :param description: The description of this OntologyProject.
        :type: str
        """
        self._description = description

    @property
    def namespace(self):
        """
        Gets the namespace of this OntologyProject.

        :return: The namespace of this OntologyProject.
        :rtype: str
        """
        return self._namespace

    @namespace.setter
    def namespace(self, namespace):
        """
        Sets the namespace of this OntologyProject.

        :param namespace: The namespace of this OntologyProject.
        :type: str
        """
        self._namespace = namespace

    @property
    def workspace_base_path(self):
        """
        Gets the workspace_base_path of this OntologyProject.

        :return: The workspace_base_path of this OntologyProject.
        :rtype: str
        """
        return self._workspace_base_path

    @workspace_base_path.setter
    def workspace_base_path(self, workspace_base_path):
        """
        Sets the workspace_base_path of this OntologyProject.

        :param workspace_base_path: The workspace_base_path of this OntologyProject.
        :type: str
        """
        self._workspace_base_path = workspace_base_path

    @property
    def lifecycle_state(self):
        """
        **[Required]** Gets the lifecycle_state of this OntologyProject.

        :return: The lifecycle_state of this OntologyProject.
        :rtype: str
        """
        return self._lifecycle_state

    @lifecycle_state.setter
    def lifecycle_state(self, lifecycle_state):
        """
        Sets the lifecycle_state of this OntologyProject.

        :param lifecycle_state: The lifecycle_state of this OntologyProject.
        :type: str
        """
        self._lifecycle_state = lifecycle_state

    @property
    def time_created(self):
        """
        Gets the time_created of this OntologyProject.

        :return: The time_created of this OntologyProject.
        :rtype: datetime
        """
        return self._time_created

    @time_created.setter
    def time_created(self, time_created):
        """
        Sets the time_created of this OntologyProject.

        :param time_created: The time_created of this OntologyProject.
        :type: datetime
        """
        self._time_created = time_created

    @property
    def time_updated(self):
        """
        Gets the time_updated of this OntologyProject.

        :return: The time_updated of this OntologyProject.
        :rtype: datetime
        """
        return self._time_updated

    @time_updated.setter
    def time_updated(self, time_updated):
        """
        Sets the time_updated of this OntologyProject.

        :param time_updated: The time_updated of this OntologyProject.
        :type: datetime
        """
        self._time_updated = time_updated

    @property
    def version(self):
        """
        Gets the version of this OntologyProject.

        :return: The version of this OntologyProject.
        :rtype: int
        """
        return self._version

    @version.setter
    def version(self, version):
        """
        Sets the version of this OntologyProject.

        :param version: The version of this OntologyProject.
        :type: int
        """
        self._version = version

    @property
    def freeform_tags(self):
        """
        Gets the freeform_tags of this OntologyProject.

        :return: The freeform_tags of this OntologyProject.
        :rtype: dict(str, str)
        """
        return self._freeform_tags

    @freeform_tags.setter
    def freeform_tags(self, freeform_tags):
        """
        Sets the freeform_tags of this OntologyProject.

        :param freeform_tags: The freeform_tags of this OntologyProject.
        :type: dict(str, str)
        """
        self._freeform_tags = freeform_tags

    @property
    def defined_tags(self):
        """
        Gets the defined_tags of this OntologyProject.

        :return: The defined_tags of this OntologyProject.
        :rtype: dict(str, dict(str, object))
        """
        return self._defined_tags

    @defined_tags.setter
    def defined_tags(self, defined_tags):
        """
        Sets the defined_tags of this OntologyProject.

        :param defined_tags: The defined_tags of this OntologyProject.
        :type: dict(str, dict(str, object))
        """
        self._defined_tags = defined_tags

    @property
    def system_tags(self):
        """
        Gets the system_tags of this OntologyProject.

        :return: The system_tags of this OntologyProject.
        :rtype: dict(str, dict(str, object))
        """
        return self._system_tags

    @system_tags.setter
    def system_tags(self, system_tags):
        """
        Sets the system_tags of this OntologyProject.

        :param system_tags: The system_tags of this OntologyProject.
        :type: dict(str, dict(str, object))
        """
        self._system_tags = system_tags

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
