# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class KnowledgeBaseSummary(object):
    """
    Summary of the KnowledgeBase.
    """

    #: A constant which can be used with the lifecycle_state property of a KnowledgeBaseSummary.
    #: This constant has a value of "CREATING"
    LIFECYCLE_STATE_CREATING = "CREATING"

    #: A constant which can be used with the lifecycle_state property of a KnowledgeBaseSummary.
    #: This constant has a value of "ACTIVE"
    LIFECYCLE_STATE_ACTIVE = "ACTIVE"

    #: A constant which can be used with the lifecycle_state property of a KnowledgeBaseSummary.
    #: This constant has a value of "UPDATING"
    LIFECYCLE_STATE_UPDATING = "UPDATING"

    #: A constant which can be used with the lifecycle_state property of a KnowledgeBaseSummary.
    #: This constant has a value of "DELETING"
    LIFECYCLE_STATE_DELETING = "DELETING"

    #: A constant which can be used with the lifecycle_state property of a KnowledgeBaseSummary.
    #: This constant has a value of "NEEDS_ATTENTION"
    LIFECYCLE_STATE_NEEDS_ATTENTION = "NEEDS_ATTENTION"

    #: A constant which can be used with the lifecycle_state property of a KnowledgeBaseSummary.
    #: This constant has a value of "DELETED"
    LIFECYCLE_STATE_DELETED = "DELETED"

    #: A constant which can be used with the lifecycle_state property of a KnowledgeBaseSummary.
    #: This constant has a value of "FAILED"
    LIFECYCLE_STATE_FAILED = "FAILED"

    def __init__(self, **kwargs):
        """
        Initializes a new KnowledgeBaseSummary object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param key:
            The value to assign to the key property of this KnowledgeBaseSummary.
        :type key: str

        :param display_name:
            The value to assign to the display_name property of this KnowledgeBaseSummary.
        :type display_name: str

        :param catalog_key:
            The value to assign to the catalog_key property of this KnowledgeBaseSummary.
        :type catalog_key: str

        :param schema_key:
            The value to assign to the schema_key property of this KnowledgeBaseSummary.
        :type schema_key: str

        :param description:
            The value to assign to the description property of this KnowledgeBaseSummary.
        :type description: str

        :param time_created:
            The value to assign to the time_created property of this KnowledgeBaseSummary.
        :type time_created: datetime

        :param created_by:
            The value to assign to the created_by property of this KnowledgeBaseSummary.
        :type created_by: str

        :param time_updated:
            The value to assign to the time_updated property of this KnowledgeBaseSummary.
        :type time_updated: datetime

        :param updated_by:
            The value to assign to the updated_by property of this KnowledgeBaseSummary.
        :type updated_by: str

        :param current_processed_items:
            The value to assign to the current_processed_items property of this KnowledgeBaseSummary.
        :type current_processed_items: int

        :param lifecycle_state:
            The value to assign to the lifecycle_state property of this KnowledgeBaseSummary.
            Allowed values for this property are: "CREATING", "ACTIVE", "UPDATING", "DELETING", "NEEDS_ATTENTION", "DELETED", "FAILED"
        :type lifecycle_state: str

        :param system_tags:
            The value to assign to the system_tags property of this KnowledgeBaseSummary.
        :type system_tags: dict(str, dict(str, object))

        """
        self.swagger_types = {
            'key': 'str',
            'display_name': 'str',
            'catalog_key': 'str',
            'schema_key': 'str',
            'description': 'str',
            'time_created': 'datetime',
            'created_by': 'str',
            'time_updated': 'datetime',
            'updated_by': 'str',
            'current_processed_items': 'int',
            'lifecycle_state': 'str',
            'system_tags': 'dict(str, dict(str, object))'
        }

        self.attribute_map = {
            'key': 'key',
            'display_name': 'displayName',
            'catalog_key': 'catalogKey',
            'schema_key': 'schemaKey',
            'description': 'description',
            'time_created': 'timeCreated',
            'created_by': 'createdBy',
            'time_updated': 'timeUpdated',
            'updated_by': 'updatedBy',
            'current_processed_items': 'currentProcessedItems',
            'lifecycle_state': 'lifecycleState',
            'system_tags': 'systemTags'
        }

        self._key = None
        self._display_name = None
        self._catalog_key = None
        self._schema_key = None
        self._description = None
        self._time_created = None
        self._created_by = None
        self._time_updated = None
        self._updated_by = None
        self._current_processed_items = None
        self._lifecycle_state = None
        self._system_tags = None

    @property
    def key(self):
        """
        **[Required]** Gets the key of this KnowledgeBaseSummary.
        Immutable Unique identifier generated at creation


        :return: The key of this KnowledgeBaseSummary.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key):
        """
        Sets the key of this KnowledgeBaseSummary.
        Immutable Unique identifier generated at creation


        :param key: The key of this KnowledgeBaseSummary.
        :type: str
        """
        self._key = key

    @property
    def display_name(self):
        """
        **[Required]** Gets the display_name of this KnowledgeBaseSummary.
        KnowledgeBase Identifier, can be renamed


        :return: The display_name of this KnowledgeBaseSummary.
        :rtype: str
        """
        return self._display_name

    @display_name.setter
    def display_name(self, display_name):
        """
        Sets the display_name of this KnowledgeBaseSummary.
        KnowledgeBase Identifier, can be renamed


        :param display_name: The display_name of this KnowledgeBaseSummary.
        :type: str
        """
        self._display_name = display_name

    @property
    def catalog_key(self):
        """
        Gets the catalog_key of this KnowledgeBaseSummary.
        the catalog hosting the KnowledgeBase


        :return: The catalog_key of this KnowledgeBaseSummary.
        :rtype: str
        """
        return self._catalog_key

    @catalog_key.setter
    def catalog_key(self, catalog_key):
        """
        Sets the catalog_key of this KnowledgeBaseSummary.
        the catalog hosting the KnowledgeBase


        :param catalog_key: The catalog_key of this KnowledgeBaseSummary.
        :type: str
        """
        self._catalog_key = catalog_key

    @property
    def schema_key(self):
        """
        Gets the schema_key of this KnowledgeBaseSummary.
        the schema inside the catalog hosting the KnowledgeBase


        :return: The schema_key of this KnowledgeBaseSummary.
        :rtype: str
        """
        return self._schema_key

    @schema_key.setter
    def schema_key(self, schema_key):
        """
        Sets the schema_key of this KnowledgeBaseSummary.
        the schema inside the catalog hosting the KnowledgeBase


        :param schema_key: The schema_key of this KnowledgeBaseSummary.
        :type: str
        """
        self._schema_key = schema_key

    @property
    def description(self):
        """
        Gets the description of this KnowledgeBaseSummary.
        The description of KnowledgeBase.


        :return: The description of this KnowledgeBaseSummary.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this KnowledgeBaseSummary.
        The description of KnowledgeBase.


        :param description: The description of this KnowledgeBaseSummary.
        :type: str
        """
        self._description = description

    @property
    def time_created(self):
        """
        **[Required]** Gets the time_created of this KnowledgeBaseSummary.
        The time at which KnowledgeBase was created. An RFC3339 formatted datetime string


        :return: The time_created of this KnowledgeBaseSummary.
        :rtype: datetime
        """
        return self._time_created

    @time_created.setter
    def time_created(self, time_created):
        """
        Sets the time_created of this KnowledgeBaseSummary.
        The time at which KnowledgeBase was created. An RFC3339 formatted datetime string


        :param time_created: The time_created of this KnowledgeBaseSummary.
        :type: datetime
        """
        self._time_created = time_created

    @property
    def created_by(self):
        """
        Gets the created_by of this KnowledgeBaseSummary.
        Identifier for KnowledgeBase creator


        :return: The created_by of this KnowledgeBaseSummary.
        :rtype: str
        """
        return self._created_by

    @created_by.setter
    def created_by(self, created_by):
        """
        Sets the created_by of this KnowledgeBaseSummary.
        Identifier for KnowledgeBase creator


        :param created_by: The created_by of this KnowledgeBaseSummary.
        :type: str
        """
        self._created_by = created_by

    @property
    def time_updated(self):
        """
        Gets the time_updated of this KnowledgeBaseSummary.
        The time at which KnowledgeBase was updated. An RFC3339 formatted datetime string


        :return: The time_updated of this KnowledgeBaseSummary.
        :rtype: datetime
        """
        return self._time_updated

    @time_updated.setter
    def time_updated(self, time_updated):
        """
        Sets the time_updated of this KnowledgeBaseSummary.
        The time at which KnowledgeBase was updated. An RFC3339 formatted datetime string


        :param time_updated: The time_updated of this KnowledgeBaseSummary.
        :type: datetime
        """
        self._time_updated = time_updated

    @property
    def updated_by(self):
        """
        Gets the updated_by of this KnowledgeBaseSummary.
        Identifier for principal who updated the KnowledgeBase


        :return: The updated_by of this KnowledgeBaseSummary.
        :rtype: str
        """
        return self._updated_by

    @updated_by.setter
    def updated_by(self, updated_by):
        """
        Sets the updated_by of this KnowledgeBaseSummary.
        Identifier for principal who updated the KnowledgeBase


        :param updated_by: The updated_by of this KnowledgeBaseSummary.
        :type: str
        """
        self._updated_by = updated_by

    @property
    def current_processed_items(self):
        """
        Gets the current_processed_items of this KnowledgeBaseSummary.
        Count of items/documents processed by KB for which embeddings are present


        :return: The current_processed_items of this KnowledgeBaseSummary.
        :rtype: int
        """
        return self._current_processed_items

    @current_processed_items.setter
    def current_processed_items(self, current_processed_items):
        """
        Sets the current_processed_items of this KnowledgeBaseSummary.
        Count of items/documents processed by KB for which embeddings are present


        :param current_processed_items: The current_processed_items of this KnowledgeBaseSummary.
        :type: int
        """
        self._current_processed_items = current_processed_items

    @property
    def lifecycle_state(self):
        """
        **[Required]** Gets the lifecycle_state of this KnowledgeBaseSummary.
        The current state of the KnowledgeBase.

        Allowed values for this property are: "CREATING", "ACTIVE", "UPDATING", "DELETING", "NEEDS_ATTENTION", "DELETED", "FAILED"


        :return: The lifecycle_state of this KnowledgeBaseSummary.
        :rtype: str
        """
        return self._lifecycle_state

    @lifecycle_state.setter
    def lifecycle_state(self, lifecycle_state):
        """
        Sets the lifecycle_state of this KnowledgeBaseSummary.
        The current state of the KnowledgeBase.


        :param lifecycle_state: The lifecycle_state of this KnowledgeBaseSummary.
        :type: str
        """
        allowed_values = ["CREATING", "ACTIVE", "UPDATING", "DELETING", "NEEDS_ATTENTION", "DELETED", "FAILED"]
        if not value_allowed_none_or_none_sentinel(lifecycle_state, allowed_values):
            raise ValueError(
                "Invalid value for `lifecycle_state`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._lifecycle_state = lifecycle_state

    @property
    def system_tags(self):
        """
        Gets the system_tags of this KnowledgeBaseSummary.
        System tags for this resource. Each key is predefined and scoped to a namespace.

        Example: `{\"orcl-cloud\": {\"free-tier-retained\": \"true\"}}`


        :return: The system_tags of this KnowledgeBaseSummary.
        :rtype: dict(str, dict(str, object))
        """
        return self._system_tags

    @system_tags.setter
    def system_tags(self, system_tags):
        """
        Sets the system_tags of this KnowledgeBaseSummary.
        System tags for this resource. Each key is predefined and scoped to a namespace.

        Example: `{\"orcl-cloud\": {\"free-tier-retained\": \"true\"}}`


        :param system_tags: The system_tags of this KnowledgeBaseSummary.
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
